private synchronized void setRetryComplete() {
    cancel(stalenessFuture);
    cancel(mutateRowsFuture);
    if (!(completionFuture.isDone())) {
        completionFuture.set("");
        if ((failedCount) > 0) {
            com.google.cloud.bigtable.grpc.async.BulkMutation.LOG.info("Batch #%d recovered from the failure and completed.", batchId);
        }
    }
    currentRequestManager = null;
    mutateRowsFuture = null;
    stalenessFuture = null;
}