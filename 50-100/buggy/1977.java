protected static int findSize(Node n) {
    if ((n.getLeft()) != null) {
        (SplayTree.sizeN)++;
        return SplayTree.findSize(n.getLeft());
    }
    if ((n.getRight()) != null) {
        (SplayTree.sizeN)++;
        return SplayTree.findSize(n.getRight());
    }
    int size = SplayTree.sizeN;
    SplayTree.sizeN = 1;
    return size;
}