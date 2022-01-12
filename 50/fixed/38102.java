@java.lang.Override
public boolean contains(int x, int y) {
    return (partitionObjects[partitions[(x + (y * width))]].partitionId) == partitionId;
}