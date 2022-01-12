public void preOrderTraverse(DataStructuresClasses.BinarySearchTree.BinaryTreeNode node) {
    if (node != null) {
        java.lang.System.out.print(((node.data) + " "));
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }
}