public T find(final java.lang.Long id) {
    manager.getTransaction().begin();
    T t = manager.find(clazz, id);
    manager.close();
    return t;
}