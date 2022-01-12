public boolean update() {
    org.hibernate.SessionFactory sf = Server.DAO.HibernateUtil.getSessionFactory();
    org.hibernate.Session session = sf.openSession();
    session.beginTransaction();
    try {
        session.update(this);
        session.getTransaction().commit();
    } catch (org.hibernate.HibernateException he) {
        session.getTransaction().rollback();
        he.printStackTrace();
        return false;
    } finally {
        session.close();
    }
    return true;
}