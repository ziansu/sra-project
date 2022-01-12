public java.lang.String[] getLeafLabelSet(pal.tree.Node peer) {
    java.util.List<java.lang.String> al = new java.util.ArrayList<>();
    getLeafLabelSet(peer, al);
    java.lang.String[] result = new java.lang.String[al.size()];
    al.toArray(result);
    return result;
}