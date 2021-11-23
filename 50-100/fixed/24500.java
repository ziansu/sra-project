private void rotateLeft(Node<V> node) {
    if (node != null) {
        Node<V> right = node.right;
        replace(node, right);
        node.right = (right == null) ? null : right.left;
        if (right != null) {
            if ((right.left) != null) {
                right.left.parent = node;
            }
            right.left = node;
        }
        node.parent = right;
    }
}