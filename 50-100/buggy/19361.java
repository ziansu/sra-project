public boolean insert(java.lang.Object object) {
    try {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(object);
        session.getTransaction().commit();
        return session.getTransaction().wasCommitted();
    } finally {
        closeSession();
    }
}