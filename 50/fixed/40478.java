public int getNodeCount() {
    int sum = 1;
    for (node.Node<D> child : getChildren()) {
        sum += child.getNodeCount();
    }
    return sum;
}