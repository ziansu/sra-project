private int requestHappy(int id, java.util.concurrent.atomic.AtomicInteger executionCounter) throws java.lang.InterruptedException {
    executionCounter.incrementAndGet();
    java.lang.Thread.sleep(eu.unicate.retroauth.LockingStrategyTests.SUCCESSFUL_REQUEST_TIME);
    return id;
}