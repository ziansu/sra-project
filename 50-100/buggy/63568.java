Server.Entity.Badge update() {
    org.hibernate.SessionFactory sf = Server.Entity.HibernateUtil.getSessionFactory();
    org.hibernate.Session session = sf.openSession();
    session.beginTransaction();
    java.lang.System.err.println("sto aggiornando");
    session.update(this);
    session.getTransaction().commit();
    session.close();
    return this;
}