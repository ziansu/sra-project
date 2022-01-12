private void postorderTraverse(Node node) {
    if (node == null) {
        return ;
    }
    postorderTraverse(node.getLeft());
    postorderTraverse(node.getRight());
    addNodeToTraversalList(node);
}