private void toRightChild(RBTree.RBNode x, RBTree.RBNode y) {
    x.rightChild = y;
    y.parent = x;
}