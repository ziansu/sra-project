public void ExpectedPresident(courtree.Node focusNode) {
    if (focusNode != null) {
        inOrderTraverseTree(focusNode.leftChild);
        if ((president.getbDate()) <= (focusNode.getbDate())) {
            java.lang.System.out.println(focusNode);
            setPresident(focusNode);
        }
        inOrderTraverseTree(focusNode.rightChild);
    }
}