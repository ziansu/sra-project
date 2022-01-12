public java.util.List<org.jgrapht.DirectedGraph<java.lang.String, org.jgraph.graph.DefaultEdge>> splitGraph(int n) {
    java.util.List<org.jgrapht.DirectedGraph<java.lang.String, org.jgraph.graph.DefaultEdge>> graphs = new java.util.ArrayList<org.jgrapht.DirectedGraph<java.lang.String, org.jgraph.graph.DefaultEdge>>();
    org.jgrapht.DirectedGraph<java.lang.String, org.jgraph.graph.DefaultEdge> graphTemp = new org.jgrapht.graph.DefaultDirectedGraph(org.jgraph.graph.DefaultEdge.class);
    graphTemp = mainGraph;
    for (int i = 0; i < n; i++) {
        graphs.add(graphTemp);
    }
    return graphs;
}