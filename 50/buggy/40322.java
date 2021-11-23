public T find(long entityID) {
    return em.find(entityClass, entityID);
}