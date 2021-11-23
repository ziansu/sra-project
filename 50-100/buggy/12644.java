private java.util.Set<edu.cmu.tetradapp.model.Node> mb(edu.cmu.tetradapp.model.Graph graph, edu.cmu.tetradapp.model.Node z) {
    java.util.Set<edu.cmu.tetradapp.model.Node> mb = new java.util.HashSet(graph.getAdjacentNodes(z));
    for (edu.cmu.tetradapp.model.Node c : graph.getChildren(z)) {
        for (edu.cmu.tetradapp.model.Node p : graph.getParents(c)) {
            mb.add(p);
        }
    }
    return mb;
}