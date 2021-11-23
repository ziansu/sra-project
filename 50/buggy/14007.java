public void insert(E e) {
    root = inserthelp(root, e);
    (nodecount)++;
}