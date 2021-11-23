@java.lang.Override
public void run() {
    try {
        partitionIdOffsetMap.put(idx, org.apache.kylin.job.streaming.StreamingUtil.findClosestOffsetWithDataTimestamp(kafkaClusterConfig, idx, targetTimestamp, streamParser));
    } catch (java.lang.Exception e) {
        org.apache.kylin.job.streaming.StreamingBootstrap.logger.error(java.lang.String.format("fail to get start offset partitionId: %d, target timestamp: %d", idx, targetTimestamp));
    } finally {
        countDownLatch.countDown();
    }
}