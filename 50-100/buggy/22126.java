public static <E> avltree.AVLTree<E> join(avltree.AVLTree<E> left, avltree.AVLTree<E> right) {
    if (left == null) {
        return right;
    }
    if (right == null) {
        return left;
    }
    return new avltree.AVLTree(avltree.AVLNode.join(left.head, right.head), left.getComparator());
}