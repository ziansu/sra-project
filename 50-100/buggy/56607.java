public java.lang.Long getCount(java.util.UUID valueId) {
    TypeModelValue tmv = em.find(valueClass, valueId);
    java.lang.String namedQuery = ((modelClass.getSimpleName()) + ".countBy") + (valueClass.getSimpleName());
    return em.createNamedQuery(namedQuery, java.lang.Long.class).setParameter("value", tmv).getSingleResult().longValue();
}