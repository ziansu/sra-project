private final long calculateSlotAddress(int slotIdx) {
    long offset = slotIdx;
    offset *= org.apache.hadoop.hdfs.ShortCircuitShm.BYTES_PER_SLOT;
    return (this.baseAddress) + offset;
}