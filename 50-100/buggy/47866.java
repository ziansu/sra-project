public java.lang.Integer count() {
    javax.persistence.EntityManager entityManager = getEntityManager();
    java.lang.Class<?> genericTypeClass = getGenericTypeClass();
    javax.persistence.Query query = entityManager.createQuery((("select count(o) from " + (genericTypeClass.getName())) + " o"));
    return ((java.lang.Integer) (query.getSingleResult()));
}