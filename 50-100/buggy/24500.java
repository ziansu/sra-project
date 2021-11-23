private void rotateLeft(Node<V> node) {
    Node<V> right = node.right;
    replace(node, right);
    node.right = right.left;
    if ((right.left) != null) {
        right.left.parent = node;
    }
    right.left = node;
    node.parent = right;
}