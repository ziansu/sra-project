public void getLeafLabelSet(pal.tree.Node peer, java.util.List<java.lang.String> al) {
    if (peer.isLeaf()) {
        al.add(peer.getIdentifier().getName());
    }else {
        getLeafLabelSet(peer.getChild(0), al);
        getLeafLabelSet(peer.getChild(1), al);
    }
}