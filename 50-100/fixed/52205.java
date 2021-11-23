@java.lang.Override
public T insert(T entity) throws com.fpmislata.daw2.core.exception.BusinessException {
    org.hibernate.Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.save(entity);
    session.getTransaction().commit();
    session.close();
    return entity;
}