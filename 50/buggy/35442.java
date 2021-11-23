public T max() {
    dushyant.lib.datastructures.AVLTree<T>.Node node = root;
    while ((node.right) != null) {
        node = node.right;
    } 
    return node.data;
}