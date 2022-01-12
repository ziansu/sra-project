public ukkonen.Node add_leaf(java.lang.String s) throws ukkonen.OverwriteEdgeException {
    if (this.out_edges.containsKey(s)) {
        throw new ukkonen.OverwriteEdgeException(s);
    }else {
        ukkonen.Node leaf = new ukkonen.Node(NodeType.LEAF, this, s);
        this.out_edges.put(s, leaf);
        return leaf;
    }
}