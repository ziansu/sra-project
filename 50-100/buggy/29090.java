public static <T> T query(utils.Hib.Query<T> query) {
    org.hibernate.Session session = utils.Hib.sessionFactory.openSession();
    final org.hibernate.Transaction transaction = session.beginTransaction();
    T t = null;
    try {
        t = query.query(session);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        transaction.rollback();
    } finally {
        session.close();
    }
    return t;
}