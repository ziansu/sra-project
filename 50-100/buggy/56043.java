protected void waitForAllTasksCompleted() {
    while (((((batcher) != null) && ((batcher.count()) > 0)) || (((pendingFutures) != null) && ((pendingFutures.size()) > 0))) || (((downloadsToInsert) != null) && ((downloadsToInsert.count()) > 0))) {
        waitBatcherCompleted(batcher);
        waitPendingFuturesCompleted(pendingFutures);
        waitBatcherCompleted(downloadsToInsert);
    } 
}