private void printTreePreOrder(org.intelligentjava.algos.trees.AbstractBinarySearchTree.Node entry) {
    if (entry != null) {
        if ((entry.value) != null) {
            java.lang.System.out.println(entry.value);
        }
        printTreeInOrder(entry.left);
        printTreeInOrder(entry.right);
    }
}