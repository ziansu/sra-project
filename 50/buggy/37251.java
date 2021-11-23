void insert(V x) {
    insert(insertWhere(root, new Node<V>(x)));
}