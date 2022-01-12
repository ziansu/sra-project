public int decrementRefCount() throws java.lang.Exception {
    int count = refCount.decrementAndGet();
    if (count < 0) {
        return count;
    }
    if ((pagingStore) != null) {
        if (count == 0) {
            pagingStore.addSize(((-(getMemoryEstimate())) - (org.hornetq.core.server.impl.MessageReferenceImpl.getMemoryEstimate())));
        }else {
            pagingStore.addSize((-(org.hornetq.core.server.impl.MessageReferenceImpl.getMemoryEstimate())));
        }
    }
    return count;
}