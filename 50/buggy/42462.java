public int sizeOfPendingFutures() {
    synchronized(this) {
        if ((pendingFutures) == null) {
            return 0;
        }
        return pendingFutures.size();
    }
}