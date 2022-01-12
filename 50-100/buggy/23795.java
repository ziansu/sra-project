private void collectKeysInorder(RBTree.RBNode node, RBTree.List<java.lang.Integer> keysList) {
    if (node == null) {
        return ;
    }
    this.collectKeysInorder(node.getLeft(), keysList);
    keysList.addItem(node.getKey());
    this.collectKeysInorder(node.getRight(), keysList);
}