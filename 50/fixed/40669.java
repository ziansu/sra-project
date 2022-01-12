public java.util.Set<net.tullco.tullutils.graphutils.Edge> getVertexEdges(java.lang.String identifier) {
    net.tullco.tullutils.graphutils.Vertex v = this.vertices.get(identifier);
    if (v == null)
        return null;
    
    return this.getVertexEdges(v);
}