private int nextPartitionId() {
    int partitionId = partitionSequence.get(((partitionIndex) % (partitionSequence.size())));
    (partitionIndex)++;
    return partitionId;
}