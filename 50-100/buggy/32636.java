public void update(graph.Node srcNode) {
    int neighborListSize = srcNode.neighborListSize();
    for (int j = 0; j < neighborListSize; j++) {
        int dest = srcNode.getNeighbor(j);
        int destPartitionNumber = graphPartition.getPartitionNumber(dest);
        graph.NodePartition destPartition = graphPartition.getPartition(destPartitionNumber);
        int destPosition = graphPartition.getNodePositionInPart(dest);
        destPartition.update(destPosition, 1);
    }
    level += 1;
}