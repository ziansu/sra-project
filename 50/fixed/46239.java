private RBTree<E>.RBNode max(RBTree<E>.RBNode current) {
    if ((current.right) == null) {
        return current;
    }
    return max(current.right);
}