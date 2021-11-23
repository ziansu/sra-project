public int size(GenericNode<T> root) {
    int size = 0;
    if (root == null) {
        size = 0;
    }else {
        for (int i = 0; i < (root.children.size()); i++) {
            size = 1 + (size(root.children.get(i)));
        }
    }
    return size;
}