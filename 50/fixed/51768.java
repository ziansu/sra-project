private int min(tree.Node node) {
    if ((node.getLeft()) == null) {
        return node.getValue();
    }else {
        return min(node.getLeft());
    }
}