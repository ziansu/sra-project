@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public T findById(java.lang.Integer key) {
    org.hibernate.Session session = sessionFactory.getCurrentSession();
    org.hibernate.Transaction trans = session.beginTransaction();
    java.lang.Object obj = session.get(managedEntity, key);
    trans.commit();
    return obj == null ? null : ((T) (obj));
}