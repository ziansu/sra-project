protected java.lang.Object openSession(in.hikev.commons.hibernate.base.HibernateManualTransactionFunc func) {
    org.hibernate.Session session = in.hikev.commons.hibernate.base.HibernateDao.sessionFactory.openSession();
    org.hibernate.Transaction transaction = session.beginTransaction();
    java.lang.Object result = func.execute(session, transaction);
    session.flush();
    session.clear();
    session.close();
    return result;
}