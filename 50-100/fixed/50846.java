public void create(java.lang.Object obj) {
    if (obj != null) {
        org.hibernate.SessionFactory sessionFactory = getSessionFactory();
        org.hibernate.Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(obj);
        session.getTransaction().commit();
        session.close();
    }
}