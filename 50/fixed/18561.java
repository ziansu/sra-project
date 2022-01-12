@java.lang.SuppressWarnings(value = "unchecked")
public T findById(java.lang.Long id) {
    return ((T) (getEntityManager().find(getGenericTypeClass(), id)));
}