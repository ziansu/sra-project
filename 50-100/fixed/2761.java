private BinarySearchTree<K>.BstNode<K> getMinimum(BinarySearchTree<K>.BstNode<K> node) {
    BinarySearchTree<K>.BstNode<K> min = node;
    while (min != null) {
        min = min.leftChild;
    } 
    return min;
}