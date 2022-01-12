public T min() {
    dushyant.lib.datastructures.AVLTree<T>.Node node = root;
    T data = null;
    while ((node.left) != null) {
        node = node.left;
    } 
    data = node.data;
    return data;
}