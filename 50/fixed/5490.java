private org.hibernate.Session getSession() {
    if ((session) == null) {
        session = sessionFactory.getCurrentSession();
    }else {
        session = sessionFactory.getCurrentSession();
    }
    return session;
}