public void leftRotate(org.caiguoqing.skye.algorithm.tree.BinaryTreeNode node) {
    org.caiguoqing.skye.algorithm.tree.BinaryTreeNode R = node.right;
    node.right = R.left;
    R.left = node;
    if ((node.parent) == null) {
        R.parent = null;
        setRoot(R);
        node.parent = R;
        return ;
    }
    if (((node.parent.left) != null) && ((node.parent.left.value) == (node.value))) {
        node.parent.left = R;
    }else {
        node.parent.right = R;
    }
    node.parent = R;
}