public void shutDown() {
    synchronized(this) {
        if (isShutDown) {
            return ;
        }
        isShutDown = true;
    }
    for (final java.util.concurrent.CountDownLatch latch : latchesToCloseOnShutdown) {
        games.strategy.util.CountDownLatchHandler.releaseLatch(latch);
    }
    latchesToCloseOnShutdown.clear();
}