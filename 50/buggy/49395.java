public void update(T t) {
    em.merge(t);
}