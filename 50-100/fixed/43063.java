public java.util.concurrent.ScheduledFuture<?> scheduleFixedRate(controller.ThreadPoolManager.ThreadType type, java.lang.Runnable command, long period, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.RejectedExecutionException {
    java.util.concurrent.ScheduledFuture<?> task = mExecutor.scheduleAtFixedRate(command, 0, period, unit);
    mTasks.put(task, type);
    return task;
}