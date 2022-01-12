private com.hendrix.erdos.types.Vertex getVertexByTag(provOSM.IGraph graph, java.lang.String tag) {
    com.hendrix.erdos.types.Vertex nv = null;
    for (com.hendrix.erdos.types.IVertex v : graph.vertices()) {
        if (v.getTag().equals(tag)) {
            nv = ((com.hendrix.erdos.types.Vertex) (v));
        }
    }
    return nv;
}