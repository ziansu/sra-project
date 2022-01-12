@java.lang.Override
public java.util.List<org.apache.kafka.common.PartitionInfo> partitionsFor(java.lang.String topic) {
    ensureNotClosed();
    return this.partitions.get(topic);
}