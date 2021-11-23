@java.lang.Override
public java.util.List<java.lang.String> cfgSysConSortByHeader(java.lang.String header, java.lang.String orderKey, java.util.List<java.lang.String> sortIdList) {
    org.hibernate.Session session = getSessionFactory();
    org.hibernate.Transaction tx = session.beginTransaction();
    java.lang.String sql = ((((super.getSqlStatment(Sqlmapping.CFG_SYSTEM_CONFIG_DATA_SORT_BY_HEANDER)) + " ") + header) + " ") + orderKey;
    org.hibernate.Query query = session.createSQLQuery(sql).setParameterList("sortIdList", sortIdList);
    return query.list();
}