public void setSourcePartitionOffsetStart(java.util.Map<java.lang.Integer, java.lang.Long> sourcePartitionOffsetStart) {
    this.sourcePartitionOffsetStart = sourcePartitionOffsetStart;
    long total = 0;
    for (java.lang.Long x : sourcePartitionOffsetStart.values()) {
        total += x;
    }
    this.sourceOffsetStart = total;
}