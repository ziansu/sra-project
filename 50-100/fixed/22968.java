public com.amazonaws.services.kinesis.scaling.ScalingOperationReport scaleUp(java.lang.String streamName, java.lang.String shardId, int byShardCount, java.lang.Integer minShards, java.lang.Integer maxShards) throws java.lang.Exception {
    int openShardCount = com.amazonaws.services.kinesis.scaling.StreamScalingUtils.getOpenShardCount(this.kinesisClient, streamName);
    double simulatedTargetPct = 1.0 / (openShardCount * byShardCount);
    return scaleStream(streamName, shardId, byShardCount, 0, 0, java.lang.System.currentTimeMillis(), minShards, maxShards);
}