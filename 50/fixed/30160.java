private synchronized boolean hasInflightRequests() {
    return !(pendingOperationsWithSize.isEmpty());
}