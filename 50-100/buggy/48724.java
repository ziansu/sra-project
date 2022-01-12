@java.lang.Override
public org.apache.flink.streaming.connectors.fs.RollingSink.BucketState snapshotState(long checkpointId, long checkpointTimestamp) throws java.lang.Exception {
    if ((writer) != null) {
        writer.flush();
    }
    if ((outStream) != null) {
        hflushOrSync(outStream);
        bucketState.currentFile = currentPartPath.toString();
        bucketState.currentFileValidLength = outStream.getPos();
    }
    synchronized(bucketState.pendingFilesPerCheckpoint) {
        bucketState.pendingFilesPerCheckpoint.put(checkpointId, bucketState.pendingFiles);
    }
    bucketState.pendingFiles = com.google.common.collect.Lists.newArrayList();
    return bucketState;
}