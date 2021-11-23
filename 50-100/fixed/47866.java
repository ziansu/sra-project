public java.lang.Integer count() {
    java.lang.Class<?> genericTypeClass = getGenericTypeClass();
    javax.persistence.Query query = getEntityManager().createQuery((("select count(o) from " + (genericTypeClass.getName())) + " o"));
    return ((java.lang.Integer) (query.getSingleResult()));
}