private long NadjiSlobodanID() {
    org.hibernate.Session sess = ba.unsa.etf.si.tim12.dal.HibernateUtil.getSessionFactory().openSession();
    org.hibernate.Query q = sess.createQuery("SELECT MAX(id) FROM Pacijent");
    java.lang.Long max_id = ((java.lang.Long) (q.uniqueResult()));
    sess.close();
    if (max_id == null)
        return 1;
    
    return max_id + 1;
}