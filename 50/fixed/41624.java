@java.lang.Override
public int createMatch(com.cidic.sdx.dggl.model.Match match) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    return ((int) (session.save(match)));
}