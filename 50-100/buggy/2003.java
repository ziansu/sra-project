private void collectValuesInorder(RBTree.RBNode node, RBTree.List<java.lang.String> keysList) {
    if (node == null) {
        return ;
    }
    this.collectValuesInorder(node.getLeft(), keysList);
    keysList.addItem(node.getValue());
    this.collectValuesInorder(node.getRight(), keysList);
}