public void save(T entity) {
    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();
}