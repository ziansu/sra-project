@java.lang.Override
public java.util.Map<java.lang.Integer, java.util.List<com.hazelcast.map.impl.mapstore.writebehind.DelayedEntry>> process(java.util.List<com.hazelcast.map.impl.mapstore.writebehind.DelayedEntry> delayedEntries) {
    java.util.Map<java.lang.Integer, java.util.List<com.hazelcast.map.impl.mapstore.writebehind.DelayedEntry>> failMap;
    sort(delayedEntries);
    if ((writeBatchSize) > 1) {
        failMap = doStoreUsingBatchSize(delayedEntries);
    }else {
        failMap = processInternal(((java.util.List) (delayedEntries)));
    }
    return failMap;
}