public void run() {
    fx.networking.nio.NIOServer.LOGGER.info("Starting up the NIOServer main run loop.");
    try {
        while (this.keepRunning) {
            eventLoopLogic();
        } 
    } catch (java.lang.NullPointerException e) {
        fx.networking.nio.NIOServer.LOGGER.info("The selector was null! {}", e);
    } finally {
        stillRunningLatch.countDown();
    }
}