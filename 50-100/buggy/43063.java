public java.util.concurrent.ScheduledFuture<?> scheduleFixedRate(controller.ThreadPoolManager.ThreadType type, java.lang.Runnable command, long period, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.RejectedExecutionException {
    if ((mExecutor) == null) {
        mExecutor = java.util.concurrent.Executors.newScheduledThreadPool(THREAD_POOL_SIZE, new controller.NamingThreadFactory("sdrtrunk"));
    }
    java.util.concurrent.ScheduledFuture<?> task = mExecutor.scheduleAtFixedRate(command, 0, period, unit);
    mTasks.put(task, type);
    return task;
}