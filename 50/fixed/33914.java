graph.Vertex createVertex(int id, graph.CanvasPosition position) {
    final graph.Vertex newVertex = new graph.Vertex(id, position, graph);
    graph.structurallyChanged(newVertex);
    return vertices.put(id, newVertex);
}