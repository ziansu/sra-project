@java.lang.Override
public void onPartitionsRevoked(java.util.Collection<org.apache.kafka.common.TopicPartition> partitions) {
    logger.info(("partitions revoked:" + partitions));
}