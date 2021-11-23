public com.algorithm.tree.BinaryTreeNode<T> findMax(com.algorithm.tree.BinaryTreeNode<T> node) {
    if (node == null) {
        return null;
    }else
        if ((node.right) == null) {
            return node;
        }
    
    return findMin(node.right);
}