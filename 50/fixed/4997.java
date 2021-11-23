public boolean removeAllVertices(java.util.Collection<? extends com.towels.graphofcontent.data.Node> c) {
    boolean changed = false;
    for (com.towels.graphofcontent.data.Node v : c) {
        changed |= removeVertex(v);
    }
    return changed;
}