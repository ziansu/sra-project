@java.lang.Override
public T getById(E id) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    session.flush();
    T value = ((T) (session.get(genericClass, id)));
    return value;
}