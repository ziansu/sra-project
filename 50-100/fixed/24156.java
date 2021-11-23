private void heapify(TreapNode node) {
    TreapNode parent = node.parent;
    while ((node != (root)) && ((node.priority) < (parent.priority))) {
        if ((parent.left) == node) {
            rotateRight(node.parent);
        }
        if ((parent.right) == node) {
            rotateLeft(node.parent);
        }
        parent = node.parent;
    } 
}