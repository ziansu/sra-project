java.lang.Integer findMaximum() {
    ctci.chapter4.BST.Node x = root;
    if (x == null) {
        return null;
    }
    while ((x.right) != null) {
        x = x.right;
    } 
    return x.key;
}