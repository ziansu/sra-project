@java.lang.Override
public void run() {
    try {
        while (!(delegate.isShutdown())) {
            this.rateLimiter.acquire();
            java.lang.Runnable r = queue.take();
            delegate.execute(r);
        } 
    } catch (java.lang.InterruptedException ie) {
        com.google.maps.internal.RateLimitExecutorService.LOG.info("Interrupted", ie);
    }
}