public void rbPrint(RBElement root) {
    java.lang.String elements = "";
    if (!(root.isNil())) {
        rbPrint(root.getLeftChild());
        elements += (root.getKey()) + " ";
        rbPrint(root.getRightChild());
    }
    java.lang.System.out.println(elements);
}