@java.lang.Override
public java.util.List<ru.blogspot.feomatr.entity.Client> getAll() {
    java.util.List<ru.blogspot.feomatr.entity.Client> l;
    org.hibernate.Session session = getCurrentSession();
    org.hibernate.Transaction tx = session.beginTransaction();
    try {
        l = session.createCriteria(ru.blogspot.feomatr.entity.Client.class).list();
    } finally {
        tx.commit();
    }
    return l;
}