@java.lang.Override
public java.util.List getAllRelease() {
    java.util.List list = null;
    try {
        session = sessionFactory.getCurrentSession();
        org.hibernate.query.Query query = session.createQuery("from ReleaseMovie");
        list = query.list();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return list;
}