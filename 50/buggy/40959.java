private void postorderTraverse(Node node) {
    if (node == null) {
        return ;
    }
    inorderTraverse(node.getLeft());
    inorderTraverse(node.getRight());
    addNodeToTraversalList(node);
}