@java.lang.Override
public org.gephi.graph.api.Edge getMutualEdge(org.gephi.graph.api.Edge e) {
    graphStore.autoReadLock();
    try {
        org.gephi.graph.store.EdgeImpl edge = graphStore.edgeStore.getMutualEdge(e);
        if (view.containsEdge(edge)) {
            return edge;
        }
        return null;
    } finally {
        graphStore.autoReadUnlock();
    }
}