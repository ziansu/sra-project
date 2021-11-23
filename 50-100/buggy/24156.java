private void heapify(TreapNode node) {
    TreapNode parent = node.parent;
    if ((node != (root)) && ((node.priority) < (parent.priority))) {
        if ((parent.left) == node) {
            rotateRight(node.parent);
            heapify(node);
        }
        if ((parent.right) == node) {
            rotateLeft(node.parent);
            heapify(node);
        }
    }
}