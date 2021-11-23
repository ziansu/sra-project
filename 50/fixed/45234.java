@java.lang.Override
public T doInTransaction(org.hibernate.Session session) {
    session.save(entity);
    return entity;
}