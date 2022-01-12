@java.lang.Override
public void save(T entity) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    session.clear();
    session.saveOrUpdate(entity);
}