private void pushPipelineToSnapshot() {
    int iterationsCnt = 0;
    boolean done = false;
    while (!done) {
        iterationsCnt++;
        org.apache.hadoop.hbase.regionserver.VersionedSegmentsList segments = pipeline.getVersionedList();
        pushToSnapshot(segments.getStoreSegments());
        done = pipeline.swap(segments, null, false, false);
        if (iterationsCnt > 2) {
            org.apache.hadoop.hbase.regionserver.CompactingMemStore.LOG.warn(("Multiple unsuccessful attempts to push the compaction pipeline to snapshot," + " while flushing to disk."));
            this.snapshot = org.apache.hadoop.hbase.regionserver.SegmentFactory.instance().createImmutableSegment(getComparator());
            break;
        }
    } 
}