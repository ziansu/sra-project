private ctci.chapter4.BST.Node searchTreeForNode(ctci.chapter4.BST.Node node, java.lang.Integer key) {
    if ((node == null) || (node.key.equals(key))) {
        return node;
    }
    if (key < (node.key)) {
        searchTreeForNode(node.left, key);
    }else {
        searchTreeForNode(node.right, key);
    }
    return null;
}