public void update(final T entity) {
    try {
        manager.getTransaction().begin();
        manager.merge(this.manager.merge(entity));
        manager.getTransaction().commit();
        manager.close();
    } catch (java.lang.Exception e) {
        manager.getTransaction().rollback();
    }
}