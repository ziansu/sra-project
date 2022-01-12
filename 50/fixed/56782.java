public java.util.List<T> getAll(java.lang.Class<T> clazz) {
    return ds.createQuery(clazz).asList();
}