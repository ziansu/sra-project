protected void waitForAllTasksCompleted() {
    while ((((batcher) != null) && ((batcher.count()) > 0)) || (((pendingFutures) != null) && ((pendingFutures.size()) > 0))) {
        com.couchbase.lite.replicator.ReplicationInternal.waitBatcherCompleted(batcher);
        com.couchbase.lite.replicator.ReplicationInternal.waitPendingFuturesCompleted(pendingFutures);
    } 
}