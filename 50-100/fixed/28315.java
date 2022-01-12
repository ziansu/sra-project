void execute(java.lang.Runnable runnable) {
    if (((actionThreadPool) == null) || (actionThreadPool.isShutdown())) {
        java.util.concurrent.ThreadPoolExecutor temp = new java.util.concurrent.ThreadPoolExecutor(1, 1, 30, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable>());
        temp.allowCoreThreadTimeOut(true);
        actionThreadPool = temp;
    }
    actionThreadPool.execute(runnable);
}