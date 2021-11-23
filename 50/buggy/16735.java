private final long calculateSlotAddress(int slotIdx) {
    return (this.baseAddress) + (slotIdx * (org.apache.hadoop.hdfs.ShortCircuitShm.BYTES_PER_SLOT));
}