private void rotateLeft(RBTree.RBNode x) {
    RBTree.RBNode y = x.rightChild;
    if ((x.parent) != null) {
        transplate(x, y);
    }
    if ((y.leftChild) != null) {
        toRightChild(x, y.leftChild);
    }
    toLeftChild(y, x);
    if ((y.parent) == null) {
        this.root = y;
    }
}