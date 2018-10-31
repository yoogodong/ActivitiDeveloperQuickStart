package com.example;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import java.util.Date;

public class AutomatedJavaDelegate implements JavaDelegate {
    public void execute(DelegateExecution execution) {
        execution.setVariable("autoWelcomeTime", new Date());

        System.out.println(execution.getVariable("fullName")+" 调用了后端Java 服务");
    }
}
