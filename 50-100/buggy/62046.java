private int indexOf(final long[] nodes, final long nodeId) {
    for (int i = (nodes.length) - 1; i != 0; i--) {
        if ((nodes[i]) == nodeId)
            return i;
        
    }
    return -1;
}