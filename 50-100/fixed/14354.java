@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<T> listAll(int firstResult, int maxResults) {
    java.lang.Class<?> genericTypeClass = getGenericTypeClass();
    javax.persistence.Query query = getEntityManager().createQuery((("select o from " + (genericTypeClass.getName())) + " o"));
    query.setFirstResult(firstResult);
    query.setMaxResults(maxResults);
    return query.getResultList();
}