public java.util.List<java.lang.Object[]> find(java.lang.String nativeQuery, java.util.List<java.lang.String> relations, java.lang.Class clazz) {
    if ((s) == null) {
        s = sf.openStatelessSession();
        s.beginTransaction();
    }
    org.hibernate.SQLQuery q = s.createSQLQuery(nativeQuery).addEntity(clazz);
    for (java.lang.String r : relations) {
        q.addScalar(r);
    }
    return q.list();
}