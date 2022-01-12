@java.lang.Override
public T getById(E id) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    T value = ((T) (session.get(genericClass, id)));
    return value;
}