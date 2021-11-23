public void add(T item) {
    list = new DBListInternal<T>(item, list);
    (size)++;
}