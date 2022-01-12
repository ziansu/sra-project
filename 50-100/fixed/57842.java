@java.lang.Override
public void flushInMemory(long flushOpSeqId) {
    org.apache.hadoop.hbase.regionserver.MemStoreSegment active = getActive();
    org.apache.hadoop.hbase.regionserver.CompactedMemStore.LOG.info("Pushing active set into compaction pipeline, and initiating compaction.");
    pushActiveToPipeline(active, true);
    java.lang.Long now = java.lang.System.currentTimeMillis();
    timestampToWALSeqId.put(now, flushOpSeqId);
    try {
        compactor.startCompact(store);
    } catch (java.io.IOException e) {
        org.apache.hadoop.hbase.regionserver.CompactedMemStore.LOG.error("Unable to run memstore compaction", e);
    }
}