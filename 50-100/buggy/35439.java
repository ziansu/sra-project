public void checkLastUpdate() {
    final long elapsed = (java.lang.System.nanoTime()) - (lastUpdated.get());
    if (elapsed >= (quietTime)) {
        org.microbule.osgi.core.QuietTimeLatch.LOGGER.info("Quiet time ({} ms) expired, releasing latch...", java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(quietTime));
        latch.countDown();
        executorService.shutdownNow();
    }else {
        executorService.schedule(this::checkLastUpdate, ((quietTime) - elapsed), java.util.concurrent.TimeUnit.NANOSECONDS);
    }
}