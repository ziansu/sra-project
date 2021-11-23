public int sizeOfPendingFutures() {
    synchronized(pendingFutures) {
        return pendingFutures.size();
    }
}