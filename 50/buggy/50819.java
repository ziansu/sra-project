private RBTree.RBNode getMin(RBTree.RBNode root2) {
    if ((root2.leftT) != null) {
        getMin(root2.getLeft());
    }
    return root2;
}