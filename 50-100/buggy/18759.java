@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<ru.blogspot.feomatr.entity.Transaction> getAll() {
    java.util.List<ru.blogspot.feomatr.entity.Transaction> l;
    org.hibernate.Session session = getCurrentSession();
    ru.blogspot.feomatr.entity.Transaction tx = session.beginTransaction();
    try {
        org.hibernate.Criteria criteria = session.createCriteria(ru.blogspot.feomatr.entity.Transaction.class);
        l = criteria.list();
    } finally {
        if (session != null) {
            session.close();
        }
    }
    return l;
}