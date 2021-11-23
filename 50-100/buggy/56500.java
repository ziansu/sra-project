private int getMostRightChildIndex(definition.TreeNode root, int rootIndex) {
    if (root == null) {
        return rootIndex;
    }
    if ((root.right) != null) {
        return getMostRightChildIndex(root.right, ((2 * rootIndex) + 1));
    }else {
    }
}