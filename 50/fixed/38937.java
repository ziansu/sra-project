void addConnection(graph.Vertex start, graph.Vertex end) {
    connections.add(new graph.Connection(start, end));
    graph.structurallyChanged(start, end);
}