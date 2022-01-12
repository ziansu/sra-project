public static boolean isChild(BinaryTree.Node root, BinaryTree.Node nodeToCheck) {
    if (null == root) {
        return false;
    }
    return ((root == nodeToCheck) || (BinaryTree.isChild(root.left, nodeToCheck))) || (BinaryTree.isChild(root.right, nodeToCheck));
}