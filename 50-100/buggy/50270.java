public java.util.List<util.Node<T>> getExitNodes() {
    if (!(isExitNodesComputed)) {
        for (util.Node<T> node : nodes) {
            for (util.Node<T> adjNode : node.getAdjacents()) {
                if (!(nodes.contains(adjNode))) {
                    exitNodes.add(node);
                }
            }
        }
        isExitNodesComputed = !(isExitNodesComputed);
    }
    return exitNodes;
}