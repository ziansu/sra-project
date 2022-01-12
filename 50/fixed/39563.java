@java.lang.Override
public void onPartitionsAssigned(java.util.Collection<org.apache.kafka.common.TopicPartition> partitions) {
    logger.info(("partitions assigned:" + partitions));
}