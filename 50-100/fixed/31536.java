private src.Blockchain.AvlTree<T>.AvlNode cloneR(src.Blockchain.AvlTree<T>.AvlNode tree) {
    if (tree == null) {
        return tree;
    }
    src.Blockchain.AvlTree<T>.AvlNode left = null;
    src.Blockchain.AvlTree<T>.AvlNode right = null;
    if ((tree.left) != null)
        left = cloneR(tree.left);
    
    if ((tree.right) != null)
        right = cloneR(tree.right);
    
    return new AvlNode(tree.elem, left, right);
}