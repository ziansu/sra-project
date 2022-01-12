public java.util.List<com.minhaz.algorithm.ds.Edge> getUnvisitedEdges(com.minhaz.algorithm.ds.Graph graph, int vertex) {
    java.util.List<com.minhaz.algorithm.ds.Edge> edges = graph.getAdjacentEdges(vertex);
    for (com.minhaz.algorithm.ds.Edge edge : edges) {
        if (edge.visited) {
            edges.remove(edge);
        }
    }
    return edges;
}