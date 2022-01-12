@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<T> listAll() {
    java.lang.Class<?> genericTypeClass = getGenericTypeClass();
    javax.persistence.Query query = getEntityManager().createQuery((("select o from " + (genericTypeClass.getName())) + " o"));
    return query.getResultList();
}