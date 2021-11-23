public org.lenskit.util.keys.KeyedObjectMapBuilder<T> add(T... items) {
    for (T item : items) {
        add(item);
    }
    return this;
}