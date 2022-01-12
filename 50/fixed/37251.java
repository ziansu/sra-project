public void add(V x) {
    insert(insertWhere(root, new Node<V>(x)));
}