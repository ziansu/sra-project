public <T> T get(java.lang.Class<T> queryClass, int id) {
    T object;
    org.hibernate.Transaction transaction = null;
    try (org.hibernate.Session session = getSessionFactory().openSession()) {
        transaction = session.beginTransaction();
        object = session.get(queryClass, id);
        transaction.commit();
    } catch (java.lang.Exception e) {
        if (transaction != null) {
            transaction.rollback();
        }
        throw e;
    }
    return object;
}