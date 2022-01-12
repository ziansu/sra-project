@java.lang.Override
public void run() {
    if (executor.isShutdown()) {
        log.debug("Scheduler is shutting down");
        return ;
    }
    pollDynamicConfigIfNeeded();
    publishCodeBaseIfNeeded();
    publishInvocationDataIfNeeded();
}