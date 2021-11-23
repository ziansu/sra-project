public com.zaxxer.hikari.util.LeakTask start() {
    exception = new java.lang.Exception();
    scheduledFuture = executorService.schedule(this, leakDetectionThreshold, java.util.concurrent.TimeUnit.MILLISECONDS);
    return this;
}