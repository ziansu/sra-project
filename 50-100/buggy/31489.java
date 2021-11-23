@java.lang.Override
public org.apache.flink.runtime.state.SerializedCheckpointData[] snapshotState(long checkpointId, long checkpointTimestamp) throws java.lang.Exception {
    org.apache.flink.streaming.api.functions.source.MessageAcknowledgingSourceBase.LOG.debug("Snapshotting state. Messages: {}, checkpoint id: {}, timestamp: {}", idsForCurrentCheckpoint, checkpointId, checkpointTimestamp);
    pendingCheckpoints.addLast(new org.apache.flink.api.java.tuple.Tuple2(checkpointId, idsForCurrentCheckpoint));
    idsForCurrentCheckpoint = new java.util.ArrayList<>(64);
    return org.apache.flink.runtime.state.SerializedCheckpointData.fromDeque(pendingCheckpoints, idSerializer);
}