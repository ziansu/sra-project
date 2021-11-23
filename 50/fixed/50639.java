@java.lang.Override
public java.util.List getSheds() {
    org.hibernate.Query query = session.createQuery("from Shed");
    return query.list();
}