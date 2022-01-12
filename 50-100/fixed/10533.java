private void passMessagesToLeaves(int i) {
    node.Node from = getNodeFromId(i);
    if (from.isLeaf()) {
        from = from.getNeighborList().get(0);
    }
    for (node.Node to : from.getNeighborList()) {
        from.passMessageTo(to);
        passMessagesToLeaves2(to, from);
    }
}