private synchronized void setRetryComplete() {
    if (!(completionFuture.isDone())) {
        completionFuture.set("");
        if ((failedCount) > 0) {
            com.google.cloud.bigtable.grpc.async.BulkMutation.LOG.info("Batch #%d recovered from the failure and completed.", batchId);
        }
    }
    cancel(stalenessFuture);
    cancel(mutateRowsFuture);
    currentRequestManager = null;
    mutateRowsFuture = null;
    stalenessFuture = null;
}