private static java.util.concurrent.ThreadPoolExecutor buildExecutor() {
    int corePoolSize = 10;
    int maximumPoolSize = 60;
    int keepAliveTime = 60;
    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
    java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> workQueue = new java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable>();
    gov.va.isaac.util.BackgroundThreadFactory threadFactory = new gov.va.isaac.util.BackgroundThreadFactory();
    return new java.util.concurrent.ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, timeUnit, workQueue, threadFactory);
}