public void addSuccessor(simpack.api.IGraphNode node) {
    if (successorSet.add(node)) {
        adjacentSet.add(node);
        (outDegree)++;
    }
}