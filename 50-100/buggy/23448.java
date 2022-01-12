public static void queryOnly(utils.Hib.QueryOnly query) {
    org.hibernate.Session session = utils.Hib.sessionFactory.openSession();
    final org.hibernate.Transaction transaction = session.beginTransaction();
    try {
        query.queryOnly(session);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        transaction.rollback();
    } finally {
        session.close();
    }
}