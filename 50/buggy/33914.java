graph.Vertex createVertex(int id, graph.CanvasPosition position) {
    final graph.Vertex newVertex = new graph.Vertex(id, position, graph);
    graph.structurallyChanged();
    return vertices.put(id, newVertex);
}