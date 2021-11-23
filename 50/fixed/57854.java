private void preorderTraverse(Node node) {
    if (node == null) {
        return ;
    }
    addNodeToTraversalList(node);
    preorderTraverse(node.getLeft());
    preorderTraverse(node.getRight());
}