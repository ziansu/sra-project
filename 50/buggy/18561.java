@java.lang.SuppressWarnings(value = "unchecked")
public T findById(java.lang.Long id) {
    javax.persistence.EntityManager entityManager = getEntityManager();
    return ((T) (entityManager.find(getGenericTypeClass(), id)));
}