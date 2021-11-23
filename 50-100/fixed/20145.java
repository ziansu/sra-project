public int setHeight(ru.mail.polis.AVLTree<E>.Node a) {
    int h;
    if (((a.left) != null) && ((a.right) != null)) {
        h = (java.lang.Math.max(a.left.height, a.right.height)) + 1;
    }else {
        h = (java.lang.Math.abs(diff(a))) + 1;
    }
    return h;
}