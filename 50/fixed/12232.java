private void toRightChild(RBTree.RBNode x, RBTree.RBNode y) {
    x.rightChild = y;
    if (y != null) {
        y.parent = x;
    }
}