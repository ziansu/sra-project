public java.util.List<edu.cmu.tetrad.sem.Node> getParents(edu.cmu.tetrad.sem.Node node) {
    java.util.List<edu.cmu.tetrad.sem.Node> parents = this.graph.getParents(node);
    parents = putErrorNodesLast(parents);
    return new java.util.ArrayList(parents);
}