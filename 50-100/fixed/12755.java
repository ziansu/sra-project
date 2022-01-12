public static void phaseThree(UndirectedGraph<java.lang.Integer, java.lang.Integer> graph, java.util.List<Graph.Vertex<java.lang.Integer>> lowDegreeVertices) {
    for (Graph.Vertex<java.lang.Integer> v : lowDegreeVertices) {
        graph.removeVertex(graph.getVertexWithElement(v.getElement()));
    }
}