@java.lang.Override
public org.gephi.graph.api.Node getNode(java.lang.Object id) {
    graphStore.autoReadLock();
    try {
        org.gephi.graph.store.NodeImpl node = graphStore.getNode(id);
        if (view.containsNode(node)) {
            return node;
        }
        return null;
    } finally {
        graphStore.autoReadUnlock();
    }
}