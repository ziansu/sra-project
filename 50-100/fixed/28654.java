public static void closeSession() throws org.hibernate.HibernateException {
    org.hibernate.Session s = ((org.hibernate.Session) (hibernate.HibernateBase.session.get()));
    hibernate.HibernateBase.session.set(null);
    if ((s != null) && (s.isOpen())) {
        s.close();
    }
}