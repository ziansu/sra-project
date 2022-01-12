private long NadjiSlobodanID() {
    org.hibernate.Session sess = ba.unsa.etf.si.tim12.dal.HibernateUtil.getSessionFactory().openSession();
    org.hibernate.Query q = sess.createQuery("SELECT MAX(id) FROM Pacijent");
    long max_id = ((java.lang.Long) (q.uniqueResult()));
    sess.close();
    return max_id + 1;
}