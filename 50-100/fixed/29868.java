public void save(final T entity) {
    try {
        manager.getTransaction().begin();
        manager.persist(entity);
        manager.getTransaction().commit();
    } catch (java.lang.Exception e) {
        manager.getTransaction().rollback();
    }
}