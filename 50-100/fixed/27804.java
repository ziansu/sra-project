protected void waitForAllTasksCompleted() {
    while ((((batcher) != null) && (!(batcher.isEmpty()))) || (((pendingFutures) != null) && ((pendingFutures.size()) > 0))) {
        com.couchbase.lite.replicator.ReplicationInternal.waitBatcherCompleted(batcher);
        com.couchbase.lite.replicator.ReplicationInternal.waitPendingFuturesCompleted(pendingFutures);
    } 
}