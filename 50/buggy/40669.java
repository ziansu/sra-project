public java.util.Set<net.tullco.tullutils.graphutils.Edge> getVertexEdges(java.lang.String identifier) {
    net.tullco.tullutils.graphutils.Vertex v = this.vertices.get(identifier);
    return this.getVertexEdges(v);
}