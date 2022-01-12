public void fill(T type) {
    for (java.util.List<T> list : list2d) {
        for (int i = 0; i < (list.size()); i++) {
            list.set(i, type);
        }
    }
}