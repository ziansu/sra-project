private com.hazelcast.jet.Traverser<java.lang.Object> traverser(java.lang.Object item) {
    long timestamp = getTimestampF.applyAsLong(((T) (item)));
    currWm = wmPolicy.reportEvent(timestamp);
    if (timestamp >= (currWm)) {
        singletonTraverser.accept(item);
    }
    if (wmEmitPolicy.shouldEmit(currWm, lastEmittedWm)) {
        lastEmittedWm = currWm;
        return singletonTraverser.prepend(new com.hazelcast.jet.Watermark(currWm));
    }
    return singletonTraverser;
}