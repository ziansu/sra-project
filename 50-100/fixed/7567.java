public java.util.List find(java.lang.String nativeQuery, java.util.List<java.lang.String> relations, java.lang.Class clazz) {
    java.util.List<java.lang.Object[]> result = new java.util.ArrayList<java.lang.Object[]>();
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