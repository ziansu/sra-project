private void printTreePostOrder(org.intelligentjava.algos.trees.AbstractBinarySearchTree.Node entry) {
    if (entry != null) {
        printTreeInOrder(entry.left);
        printTreeInOrder(entry.right);
        java.lang.System.out.println(entry.value);
    }
}