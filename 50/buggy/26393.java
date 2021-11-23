public void waitForShutdown() {
    beginShutdown();
    try {
        this.thread.join();
    } catch (java.lang.InterruptedException e) {
        org.apache.kafka.trogdor.coordinator.Coordinator.log.error("Interrupted while waiting for thread shutdown", e);
        java.lang.Thread.currentThread().interrupt();
    }
}