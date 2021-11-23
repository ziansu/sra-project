@java.lang.Override
public T insert(T entity) throws com.fpmislata.daw2.core.exception.BusinessException {
    T t;
    org.hibernate.Session session = sessionFactory.openSession();
    session.beginTransaction();
    t = ((T) (session.save(entity)));
    session.getTransaction().commit();
    session.close();
    return t;
}