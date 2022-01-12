public int getBalanceFactor(Node root, int height) {
    if ((root.getData()) == null) {
        return height;
    }else {
        height++;
        return (getBalanceFactor(root.getLeftChild(), height)) - (getBalanceFator(root.getRightChild(), height));
    }
}