private com.hazelcast.jet.Traverser<java.lang.Object> traverser(java.lang.Object item) {
    long timestamp = getTimestampF.applyAsLong(((T) (item)));
    if (timestamp < (currWm)) {
        return com.hazelcast.jet.Traversers.empty();
    }
    currWm = wmPolicy.reportEvent(timestamp);
    singletonTraverser.accept(item);
    if (wmEmitPolicy.shouldEmit(currWm, lastEmittedWm)) {
        lastEmittedWm = currWm;
        return singletonTraverser.prepend(new com.hazelcast.jet.Watermark(currWm));
    }
    return singletonTraverser;
}