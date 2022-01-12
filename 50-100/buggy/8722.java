public void addEdge(diagraph.DirectedEdge edge) {
    int from = edge.from();
    if (!(edges.containsKey(from))) {
        edges.put(from, new java.util.HashSet<>());
    }
    java.util.Set<diagraph.DirectedEdge> outgoingEdges = edges.get(from);
    outgoingEdges.add(edge);
}