public void close() throws java.io.IOException {
    this.keepRunning = false;
    try {
        this.selector.wakeup();
        stillRunningLatch.await();
    } catch (java.lang.InterruptedException e) {
        fx.networking.nio.NIOServer.LOGGER.info("interrupted while closing the NIOServer: {}", e);
    }
    if (this.selector.isOpen()) {
        this.selector.close();
    }
}