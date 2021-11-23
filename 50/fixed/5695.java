public T get(PK id) {
    return em.find(type, id);
}