protected int depth(org.pg4200.datastructure.map.tree.BinaryTreeMap<K, V>.TreeNode node) {
    int leftDepth = 0;
    int rightDepth = 0;
    if ((node.left) != null) {
        leftDepth = depth(node.left);
    }
    if ((node.right) != null) {
        rightDepth = depth(node.right);
    }
    return 1 + (java.lang.Math.max(leftDepth, rightDepth));
}