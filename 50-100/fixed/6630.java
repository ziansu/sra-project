public static java.util.List get(java.lang.String query) {
    org.hibernate.Session session = de.bpetry.data.HibernateSession.sessionFactory.openSession();
    session.beginTransaction();
    java.util.List result = session.createQuery(query).list();
    session.getTransaction().commit();
    session.close();
    return result;
}