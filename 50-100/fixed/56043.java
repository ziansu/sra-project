protected void waitForAllTasksCompleted() {
    while (((((batcher) != null) && (!(batcher.isEmpty()))) || (((pendingFutures) != null) && ((pendingFutures.size()) > 0))) || (((downloadsToInsert) != null) && (!(downloadsToInsert.isEmpty())))) {
        waitBatcherCompleted(batcher);
        waitPendingFuturesCompleted(pendingFutures);
        waitBatcherCompleted(downloadsToInsert);
    } 
}