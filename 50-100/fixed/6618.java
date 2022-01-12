public void ExpectedPresident(courtree.Node focusNode) {
    if (focusNode != null) {
        ExpectedPresident(focusNode.leftChild);
        if ((president.getbDate()) <= (focusNode.getbDate())) {
            java.lang.System.out.println(focusNode);
            setPresident(focusNode);
        }
        ExpectedPresident(focusNode.rightChild);
    }
}