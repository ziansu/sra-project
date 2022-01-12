private int indexOf(final long[] nodes, final long nodeId) {
    int end = (nodes.length) - 1;
    for (int i = 0; i != end; i++) {
        if ((nodes[i]) == nodeId)
            return i;
        
    }
    return -1;
}