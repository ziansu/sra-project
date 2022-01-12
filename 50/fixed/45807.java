public void ack(long offset) {
    try {
        synchronized(pendingOffsets) {
            pendingOffsets.remove(offset);
        }
    } catch (java.lang.Exception e) {
        com.alibaba.jstorm.kafka.PartitionConsumer.LOG.error(("offset ack error " + offset));
    }
}