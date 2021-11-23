private BinarySearchTree<K>.BstNode<K> getMinimum(BinarySearchTree<K>.BstNode<K> node) {
    BinarySearchTree<K>.BstNode<K> min = root;
    while (min != null) {
        min = min.leftChild;
    } 
    return min;
}