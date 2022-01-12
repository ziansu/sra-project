private void insert(Node<V> node) {
    if ((root) == null) {
        root = node;
    }
    insertCase1(node);
}