public void fill(T type) {
    for (java.util.List<T> list : list2d) {
        for (int i = 0; i < (list.size()); i++) {
            final T item = list.get(i);
            if ((item == null) || (item != type)) {
                list.set(i, type);
            }
        }
    }
}