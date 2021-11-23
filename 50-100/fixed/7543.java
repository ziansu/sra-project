public void printTree(DataStructure.RBTNode<T> node) {
    if (node != null) {
        printTree(node.left);
        java.lang.System.out.print((((((((node.color) == (RBTNode.RED) ? "Color: Red " : "Color: Black ") + "Key: ") + (node.key)) + " Parent: ") + (node.parent.key)) + "\n"));
        printTree(node.right);
    }
}