private V first(Node<V> node) {
    if (node == null) {
        return null;
    }
    while ((node.left) != null) {
        node = node.left;
    } 
    return node.value;
}