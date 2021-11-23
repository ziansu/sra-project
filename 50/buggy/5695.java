public T get(PK id) {
    T obj = em.find(type, id);
    if (obj != null)
        em.detach(obj);
    
    return obj;
}