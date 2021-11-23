public void ack(long offset) {
    try {
        pendingOffsets.remove(offset);
    } catch (java.lang.Exception e) {
        com.alibaba.jstorm.kafka.PartitionConsumer.LOG.error(("offset ack error " + offset));
    }
}