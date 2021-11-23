@java.lang.Override
public ENTITY getByUidAndUap(long uid, java.lang.String uapp) {
    java.lang.String queryJpql = java.lang.String.format("SELECT e FROM %s WHERE uid=:uid AND uapp=uapp", getEntityClass().getSimpleName());
    java.util.Map<java.lang.String, java.lang.Object> params = new java.util.HashMap<java.lang.String, java.lang.Object>();
    params.put("uid", uid);
    params.put("uapp", uapp);
    org.lnu.is.queries.Query<ENTITY> query = new org.lnu.is.queries.Query(getEntityClass(), queryJpql, params);
    return persistenceManager.getSingleResult(query);
}