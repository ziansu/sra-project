public TreeNode<T> doubleRotateRightLeft(TreeNode<T> k3) {
    k3.rson = singleRotateLeft(k3.rson);
    return singleRotateRight(k3);
}