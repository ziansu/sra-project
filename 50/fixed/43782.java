private boolean shouldFlushInMemory() {
    if ((getActive().getSize()) > (inmemoryFlushSize)) {
        return inMemoryFlushInProgress.compareAndSet(false, true);
    }
    return false;
}