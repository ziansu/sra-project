public T saveOrUpdate(T entity) throws java.lang.Exception {
    getSession().saveOrUpdate(entity);
    return entity;
}