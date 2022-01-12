public double calculateMinCut() {
    org.jgrapht.graph.SimpleWeightedGraph<V, org.jgrapht.graph.DefaultWeightedEdge> gomoryHuTree = this.getGomoryHuTree();
    org.jgrapht.graph.DefaultWeightedEdge cheapestEdge = gomoryHuTree.edgeSet().stream().min(java.util.Comparator.comparing(gomoryHuTree::getEdgeWeight)).orElseThrow(() -> new java.lang.RuntimeException("graph is empty?!"));
    lastInvokedSource = gomoryHuTree.getEdgeSource(cheapestEdge);
    lastInvokedTarget = gomoryHuTree.getEdgeTarget(cheapestEdge);
    sourcePartitionLastInvokedSource = null;
    return gomoryHuTree.getEdgeWeight(cheapestEdge);
}