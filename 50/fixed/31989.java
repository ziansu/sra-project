public boolean delete(java.lang.Integer value) {
    if (value == null) {
        return false;
    }
    com.kohls.trinaryTree.TrinaryTreeNode currentNode = root;
    root = deleteNode(currentNode, new com.kohls.trinaryTree.TrinaryTreeNode(value));
    return true;
}