private void initVertices() {
    for (org.s1ck.gdl.model.Vertex v : gdlHandler.getVertices()) {
        initVertex(v);
    }
    for (java.util.Map.Entry<java.lang.String, org.s1ck.gdl.model.Vertex> e : gdlHandler.getVertexCache().entrySet()) {
        updateVertexCache(e.getKey(), e.getValue());
    }
}