public void unregisterEventProcessor() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    logWithHost(java.util.logging.Level.INFO, "Stopping event processing");
    this.partitionManager.stopPartitions();
    try {
        this.partitionManagerFuture.get();
        if (com.microsoft.azure.eventprocessorhost.EventProcessorHost.weOwnExecutor) {
            if (((com.microsoft.azure.eventprocessorhost.EventProcessorHost.executorRefCount) <= 0) && (com.microsoft.azure.eventprocessorhost.EventProcessorHost.autoShutdownExecutor)) {
                com.microsoft.azure.eventprocessorhost.EventProcessorHost.executorService.awaitTermination(10, java.util.concurrent.TimeUnit.MINUTES);
            }
        }
    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
        logWithHost(java.util.logging.Level.SEVERE, "Failure shutting down", e);
        throw e;
    }
}