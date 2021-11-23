private TwoThreeFourTree.TreeNode<K, V> findLeftMostNodeForRemoveOperation(TwoThreeFourTree.TreeNode<K, V> node) throws java.lang.Exception {
    if ((node.items.size()) == 1) {
        node = FixOneKeyNode(node);
    }
    TwoThreeFourTree.TreeNode<K, V> leftNode = node.getLeftChildNodeForItem(0);
    if (leftNode != null) {
        return findLeftMostNodeForRemoveOperation(leftNode);
    }else {
        return node;
    }
}