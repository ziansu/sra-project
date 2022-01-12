public java.util.Set<org.zetool.graph.Node> getReachableNodes() {
    if (!(this.isProblemSolved())) {
        throw new java.lang.IllegalStateException("Can only be called once the algorithm has run!");
    }
    if ((reachableNodes) == null) {
        for (org.zetool.graph.Node n : getProblem()) {
            if ((distances.get(n)) < (java.lang.Integer.MAX_VALUE)) {
                reachableNodes.add(n);
            }
        }
    }
    return reachableNodes;
}