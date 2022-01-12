private void printBinaryTree(BinaryTreeNode<K, V> p) {
    if (p != null) {
        printBinaryTree(p.left);
        java.lang.System.out.println(p.toString());
        printBinaryTree(p.right);
    }
}