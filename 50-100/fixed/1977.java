protected static int findSize(Node n) {
    if (n == null)
        return 0;
    else {
        return ((SplayTree.findSize(n.getLeft())) + 1) + (SplayTree.findSize(n.getRight()));
    }
}