@java.lang.Override
public org.apache.hadoop.hbase.regionserver.MemStoreSnapshot snapshot() {
    org.apache.hadoop.hbase.regionserver.MemStoreSegment active = getActive();
    if (!(getSnapshot().isEmpty())) {
        org.apache.hadoop.hbase.regionserver.CompactedMemStore.LOG.warn(("Snapshot called again without clearing previous. " + "Doing nothing. Another ongoing flush or did we fail last attempt?"));
    }else {
        org.apache.hadoop.hbase.regionserver.CompactedMemStore.LOG.info(("FORCE FLUSH MODE: Pushing active set into compaction pipeline, " + "and pipeline tail into snapshot."));
        pushActiveToPipeline(active, false);
        this.snapshotId = org.apache.hadoop.hbase.util.EnvironmentEdgeManager.currentTime();
        pushTailToSnapshot();
        resetForceFlush();
    }
    return new org.apache.hadoop.hbase.regionserver.MemStoreSnapshot(this.snapshotId, getSnapshot(), getComparator());
}