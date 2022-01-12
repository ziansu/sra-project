protected T getSingleResult(javax.persistence.Query query) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<T> list = query.getResultList();
    if (list.isEmpty())
        return null;
    
    if ((list.size()) == 1)
        return list.get(0);
    
    throw new javax.persistence.NonUniqueResultException((("SingleResult query returned " + (list.size())) + " elements"));
}