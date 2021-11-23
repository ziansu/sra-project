public void addSuccessor(simpack.api.IGraphNode node) {
    successorSet.add(node);
    adjacentSet.add(node);
    (outDegree)++;
}