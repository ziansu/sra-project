private void pushTailToSnapshot() {
    org.apache.hadoop.hbase.regionserver.VersionedSegmentsList segments = pipeline.getVersionedTail();
    pushToSnapshot(segments.getStoreSegments());
    pipeline.swap(segments, null, false);
}