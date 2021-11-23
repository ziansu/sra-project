public static void main(java.lang.String[] args) {
    org.hibernate.SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
    org.hibernate.Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.getTransaction().commit();
    session.close();
}