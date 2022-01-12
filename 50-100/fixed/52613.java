private ctci.chapter4.BST.Node searchTreeForNode(ctci.chapter4.BST.Node node, java.lang.Integer key) {
    if ((node == null) || (node.key.equals(key))) {
        return node;
    }
    if (key < (node.key)) {
        return searchTreeForNode(node.left, key);
    }else {
        return searchTreeForNode(node.right, key);
    }
}