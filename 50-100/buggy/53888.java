public static void main(java.lang.String[] args) {
    boogy.ejada.MH_User2 user = new boogy.ejada.MH_User2();
    user.setName("Mohamed Hassan");
    org.hibernate.SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
    org.hibernate.Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.save(user);
    session.getTransaction().commit();
    session.close();
}