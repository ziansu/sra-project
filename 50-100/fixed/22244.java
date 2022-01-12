public void delete(final T entity) {
    try {
        manager.getTransaction().begin();
        manager.remove(entity);
        manager.getTransaction().commit();
    } catch (java.lang.Exception e) {
        manager.getTransaction().rollback();
    }
}