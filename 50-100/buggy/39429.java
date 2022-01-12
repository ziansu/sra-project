@java.lang.Override
public org.gephi.graph.api.Edge getEdge(java.lang.Object id) {
    graphStore.autoReadLock();
    try {
        org.gephi.graph.store.EdgeImpl edge = graphStore.getEdge(id);
        if (view.containsEdge(edge)) {
            return edge;
        }
        return null;
    } finally {
        graphStore.autoReadUnlock();
    }
}