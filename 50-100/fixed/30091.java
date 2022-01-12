protected org.apache.flink.runtime.io.network.partition.consumer.BufferOrEvent getNonProcessed() {
    org.apache.flink.runtime.io.network.partition.consumer.BufferOrEvent nextNonprocessed;
    while ((nextNonprocessed = nonprocessed.poll()) != null) {
        if (isBlocked(nextNonprocessed.getChannelIndex())) {
            blockedNonprocessed.add(nextNonprocessed);
        }else {
            return nextNonprocessed;
        }
    } 
    return null;
}