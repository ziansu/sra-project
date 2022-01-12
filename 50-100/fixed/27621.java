@org.junit.Test
public void testTaskFailedUpdate() {
    context.refresh();
    java.lang.RuntimeException exception = new java.lang.RuntimeException("This was expected");
    org.springframework.boot.SpringApplication application = new org.springframework.boot.SpringApplication();
    this.taskExplorer = context.getBean(org.springframework.cloud.task.repository.TaskExplorer.class);
    context.publishEvent(new org.springframework.boot.context.event.ApplicationFailedEvent(application, new java.lang.String[0], context, exception));
    context.publishEvent(new org.springframework.boot.context.event.ApplicationReadyEvent(application, new java.lang.String[0], context));
    verifyTaskExecution(0, true, 1, exception);
}