@java.lang.Override
public java.util.List<org.apache.kafka.common.PartitionInfo> partitionsFor(java.lang.String topic) {
    ensureNotClosed();
    java.util.List<org.apache.kafka.common.PartitionInfo> parts = this.partitions.get(topic);
    if (parts == null)
        return java.util.Collections.emptyList();
    else
        return parts;
    
}