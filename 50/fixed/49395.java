public T update(T t) {
    this.em.merge(t);
    return t;
}