@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public ua.goit.group6.model.Admin getByLogin(java.lang.String login) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    org.hibernate.query.Query query = session.createQuery("from Admin A where A.login like :login");
    query.setParameter("login", login);
    return ((ua.goit.group6.model.Admin) (query.list().get(0)));
}