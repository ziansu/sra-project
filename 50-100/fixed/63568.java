Server.Entity.Badge update() {
    org.hibernate.SessionFactory sf = Server.Entity.HibernateUtil.getSessionFactory();
    org.hibernate.Session session = sf.openSession();
    session.beginTransaction();
    session.update(this);
    session.getTransaction().commit();
    session.close();
    return this;
}