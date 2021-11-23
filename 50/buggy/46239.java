private E max(RBTree<E>.RBNode current) {
    if ((current.right) == null) {
        return current.data;
    }
    return max(current.right);
}