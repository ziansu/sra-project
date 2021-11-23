@java.lang.Override
public java.util.concurrent.ScheduledFuture<?> schedule(final java.lang.Runnable command, final long delay, final java.util.concurrent.TimeUnit unit) {
    checkUIState();
    final com.ponysdk.core.concurrent.UIScheduledThreadPoolExecutor.UIRunnable runnable = new com.ponysdk.core.concurrent.UIScheduledThreadPoolExecutor.UIRunnable(command);
    final java.util.concurrent.ScheduledFuture<?> future = executor.schedule(runnable, delay, unit);
    runnable.setFuture(future);
    registerTask(runnable);
    return future;
}