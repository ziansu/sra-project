@java.lang.Override
public void run() {
    try {
        while (!(delegate.isShutdown())) {
            this.rateLimiter.acquire();
            java.lang.Runnable r = queue.take();
            r.run();
        } 
    } catch (java.lang.InterruptedException ie) {
        com.google.maps.internal.RateLimitExecutorService.LOG.info("Interrupted", ie);
    }
}