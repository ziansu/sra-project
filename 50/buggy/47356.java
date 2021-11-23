public void flush() throws java.io.IOException {
    com.google.cloud.bigtable.grpc.async.AsyncExecutor.LOG.trace("Flushing");
    try {
        sizeManager.waitUntilAllOperationsAreDone();
    } catch (java.lang.InterruptedException e) {
        java.lang.Thread.currentThread().interrupt();
    }
    com.google.cloud.bigtable.grpc.async.AsyncExecutor.LOG.trace("Done flushing");
}