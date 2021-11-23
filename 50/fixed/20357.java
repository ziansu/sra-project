private ctci.chapter4.BST.Node findMaximum(ctci.chapter4.BST.Node node) {
    ctci.chapter4.BST.Node x = node;
    if (x == null) {
        return null;
    }
    while ((x.right) != null) {
        x = x.right;
    } 
    return x;
}