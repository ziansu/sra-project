public void addEdge(org.ucombinator.jaam.visualizer.layout.LayoutEdge edge) {
    this.inEdges.putIfAbsent(edge.getSource(), new java.util.HashMap<>());
    this.inEdges.get(edge.getSource()).put(edge.getDest(), edge);
    this.outEdges.putIfAbsent(edge.getDest(), new java.util.HashMap<>());
    this.outEdges.get(edge.getDest()).put(edge.getSource(), edge);
}