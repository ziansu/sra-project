public void rbPrint(RBElement root) {
    java.lang.String elements = "";
    if (!(root.isNil())) {
        elements += (root.getKey()) + " ";
        java.lang.System.out.println(elements);
        rbPrint(root.getLeftChild());
        rbPrint(root.getRightChild());
    }
}