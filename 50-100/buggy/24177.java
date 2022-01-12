public static UndirectedGraph<java.lang.Integer, java.lang.Integer> getNeighbourGraph(UndirectedGraph graph, Graph.Vertex v) {
    java.util.List<Graph.Vertex<java.lang.Integer>> neighbours = new java.util.ArrayList<Graph.Vertex<java.lang.Integer>>();
    java.util.Iterator<Graph.Vertex<java.lang.Integer>> it = graph.neighbours(v);
    while (it.hasNext()) {
        neighbours.add(it.next());
    } 
    return makeGraphFromVertexSet(graph, neighbours);
}