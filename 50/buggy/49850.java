public T min() {
    dushyant.lib.datastructures.AVLTree<T>.Node node = root;
    while ((node.left) != null) {
        node = node.left;
    } 
    return node.data;
}