@java.lang.Override
public org.gephi.graph.api.Edge getEdge(org.gephi.graph.api.Node node1, org.gephi.graph.api.Node node2) {
    graphStore.autoReadLock();
    try {
        org.gephi.graph.store.EdgeImpl edge = graphStore.edgeStore.get(node1, node2);
        if ((edge != null) && (view.containsEdge(edge))) {
            return edge;
        }
        return null;
    } finally {
        graphStore.autoReadUnlock();
    }
}