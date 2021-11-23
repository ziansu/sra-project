protected org.apache.flink.runtime.io.network.partition.consumer.BufferOrEvent getNonProcessed() {
    org.apache.flink.runtime.io.network.partition.consumer.BufferOrEvent nextNonprocessed = null;
    while ((nextNonprocessed == null) && (!(nonprocessed.isEmpty()))) {
        nextNonprocessed = nonprocessed.poll();
        if (isBlocked(nextNonprocessed.getChannelIndex())) {
            blockedNonprocessed.add(nextNonprocessed);
            nextNonprocessed = null;
        }
    } 
    return nextNonprocessed;
}