private void printTreeInOrder(org.intelligentjava.algos.trees.AbstractBinarySearchTree.Node entry) {
    if (entry != null) {
        printTreeInOrder(entry.left);
        if ((entry.value) != null) {
            java.lang.System.out.println(entry.value);
        }
        printTreeInOrder(entry.right);
    }
}