@java.lang.Override
public java.util.List<T> doInTransaction(org.hibernate.Session session) {
    return list(createCriteria(session));
}