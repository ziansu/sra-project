@java.lang.Override
public java.util.List<edu.itis.webapp.dao.entities.User> getAll() {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    org.hibernate.Query query = session.createQuery("FROM User");
    return query.list();
}