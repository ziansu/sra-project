private graph.CapGraph getTransposeGraph(graph.CapGraph graph) {
    graph.CapGraph transposeGraph = new graph.CapGraph();
    java.util.Set<java.lang.Integer> friends = theGraph.keySet();
    for (java.lang.Integer node : friends) {
        transposeGraph.addVertex(node);
    }
    for (java.lang.Integer node : friends) {
        java.util.HashSet<java.lang.Integer> moreFriends = theGraph.get(node);
        for (java.lang.Integer friendNode : moreFriends) {
            transposeGraph.addEdge(friendNode, node);
        }
    }
    return transposeGraph;
}