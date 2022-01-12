public T create(T t) {
    this.em.persist(t);
    return t;
}