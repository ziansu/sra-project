@java.lang.Override
public java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(final java.lang.Runnable command, final long initialDelay, final long period, final java.util.concurrent.TimeUnit unit) {
    checkUIState();
    final com.ponysdk.core.concurrent.UIScheduledThreadPoolExecutor.UIRunnable runnable = new com.ponysdk.core.concurrent.UIScheduledThreadPoolExecutor.UIRunnable(command);
    final java.util.concurrent.ScheduledFuture<?> future = executor.scheduleAtFixedRate(runnable, initialDelay, period, unit);
    runnable.setFuture(future);
    registerTask(runnable);
    return runnable;
}