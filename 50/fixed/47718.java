java.lang.Integer getInitialPartitionId() {
    return getRandomElement(partitions.keySet());
}