private void removeNodeImpl(nodebox.client.Node node) {
    com.google.common.base.Preconditions.checkNotNull(node, "Node to remove cannot be null.");
    com.google.common.base.Preconditions.checkArgument(getActiveNetwork().hasChild(node), "Node to remove is not in active network.");
    if (node == (getActiveNode())) {
        setActiveNode(((nodebox.client.Node) (null)));
    }
    controller.removeNode(activeNetworkPath, node.getName());
}