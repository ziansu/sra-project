public void inOrderTraverse(DataStructuresClasses.BinarySearchTree.BinaryTreeNode node) {
    if (node != null) {
        inOrderTraverse(node.left);
        java.lang.System.out.print(((node.data) + " "));
        inOrderTraverse(node.right);
    }
}