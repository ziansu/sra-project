public void save(final T entity) {
    try {
        manager.getTransaction().begin();
        manager.persist(entity);
        manager.getTransaction().commit();
        manager.close();
    } catch (java.lang.Exception e) {
        manager.getTransaction().rollback();
    }
}