@java.lang.Override
public com.google.common.base.Optional<org.spongepowered.api.service.scheduler.Task> runRepeatingTaskAfter(java.lang.Object plugin, java.lang.Runnable task, long interval, long delay) {
    org.spongepowered.common.service.scheduler.ScheduledTask scheduledTask = this.createTask(plugin, task, delay, interval);
    return this.addTask(scheduledTask);
}