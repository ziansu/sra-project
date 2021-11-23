private int nextPartitionId() {
    return partitionSequence.get((((partitionIndex)++) % (partitionSequence.size())));
}