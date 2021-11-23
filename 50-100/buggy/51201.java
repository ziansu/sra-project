public boolean existsInSubtree(BinarySearchTree.Node a, BinarySearchTree.Node b) {
    if ((a != null) && (a == b))
        return true;
    
    boolean left;
    boolean right;
    if ((a.left) != null)
        left = existsInSubtree(a.left, b);
    
    if ((a.right) != null)
        right = existsInSubtree(a.right, b);
    
    return left || right;
}