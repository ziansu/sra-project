private E promotePredecessor(com.mdorst.SortedTree<E>.Node n) {
    if ((n.left.data) == null) {
        E data = n.data;
        n.data = null;
        return data;
    }
    com.mdorst.SortedTree<E>.Node predecessor = rightMost(n.left);
    return promotePredecessor(predecessor);
}