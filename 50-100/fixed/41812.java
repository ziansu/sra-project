private void rotateLeft(RBTree.RBNode x) {
    RBTree.RBNode y = x.rightChild;
    transplate(x, y);
    toRightChild(x, y.leftChild);
    toLeftChild(y, x);
    if ((y.parent) == null) {
        this.root = y;
    }
}