@java.lang.Override
public java.util.List getAllRelease() {
    java.util.List list = null;
    try {
        session = sessionFactory.getCurrentSession();
        org.hibernate.query.Query query = session.createQuery("from ReleaseMovie");
        list = query.list();
        java.lang.System.out.println(("m:" + (((com.movie.model.ReleaseMovie) (list.get(2))).getMovieName())));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return list;
}