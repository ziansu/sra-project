public static boolean isChild(BinaryTree.Node root, BinaryTree.Node nodeToCheck) {
    if (null == root) {
        return false;
    }
    if (root == nodeToCheck) {
        return true;
    }
    return (BinaryTree.isChild(root.left, nodeToCheck)) || (BinaryTree.isChild(root.right, nodeToCheck));
}