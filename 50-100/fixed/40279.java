private void initEdges() {
    for (org.s1ck.gdl.model.Edge e : gdlHandler.getEdges()) {
        initEdge(e);
    }
    for (java.util.Map.Entry<java.lang.String, org.s1ck.gdl.model.Edge> e : gdlHandler.getEdgeCache().entrySet()) {
        updateEdgeCache(e.getKey(), e.getValue());
    }
}