public boolean hasInflightRequests() {
    synchronized(pendingOperationsWithSize) {
        cleanupFinishedOperations();
        return !(pendingOperationsWithSize.isEmpty());
    }
}