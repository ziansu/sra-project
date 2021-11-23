public T findById(Id id) {
    T t = ((T) (getSessionFactory().getCurrentSession().get(getEntityClass(), id)));
    initialize(t);
    return t;
}