public final java.util.List<E> take(int n) {
    if (n == 0) {
        return new java.util.ArrayList<>();
    }
    return getTheList(n, (-1));
}