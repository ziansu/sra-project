public static java.util.Collection<dk.cs.aau.sw705e15.model.Computer> findClusterOfSizeFromComputerNode(dk.cs.aau.sw705e15.rater.clustering.Dendrogram.ComputerNode fromNode, final int desiredSize) {
    while (((fromNode.getParent()) != null) && ((fromNode.getParent().getComputers().size()) < desiredSize)) {
        fromNode = fromNode.getParent();
    } 
    return fromNode.getComputers();
}