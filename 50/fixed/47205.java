public T find(final java.lang.Long id) {
    T t = manager.find(clazz, id);
    return t;
}