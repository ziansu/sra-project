@java.lang.Override
public void createMatch(com.cidic.sdx.dggl.model.Match match) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    session.save(match);
}