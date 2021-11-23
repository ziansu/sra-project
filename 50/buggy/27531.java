@org.activiti.management.jmx.annotations.ManagedAttribute(description = "check if the job executor is activated")
public boolean isJobExecutorActivated() {
    return ((jobExecutor) == null) || (jobExecutor.isActive());
}