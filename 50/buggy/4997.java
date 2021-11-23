public boolean removeAllVertices(java.util.Collection<? extends com.towels.graphofcontent.data.Node> vertices) {
    boolean changed = false;
    for (com.towels.graphofcontent.data.Node v : vertices) {
        changed |= removeVertex(v);
    }
    return changed;
}