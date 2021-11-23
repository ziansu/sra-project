public void removeShutdownLatch(final java.util.concurrent.CountDownLatch latch) {
    synchronized(this) {
        games.strategy.util.CountDownLatchHandler.releaseLatch(latch);
        latchesToCloseOnShutdown.remove(latch);
    }
}