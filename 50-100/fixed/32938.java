public void addEdge(org.ucombinator.jaam.visualizer.layout.LayoutEdge edge) {
    this.outEdges.putIfAbsent(edge.getSource(), new java.util.HashMap<>());
    this.outEdges.get(edge.getSource()).put(edge.getDest(), edge);
    this.inEdges.putIfAbsent(edge.getDest(), new java.util.HashMap<>());
    this.inEdges.get(edge.getDest()).put(edge.getSource(), edge);
}