public T getById(java.lang.Long id) {
    return ((T) (getSession().load(getPersistentClass(), id)));
}