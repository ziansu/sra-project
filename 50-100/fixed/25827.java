public int getBalanceFactor(Node node, int height) {
    if (node == null) {
        return height;
    }else {
        height++;
        return (getBalanceFactor(node.getLeftChild(), height)) - (getBalanceFactor(node.getRightChild(), height));
    }
}