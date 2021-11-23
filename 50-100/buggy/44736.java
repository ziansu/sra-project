@java.lang.Override
public ENTITY getByUidAndUap(long uid, java.lang.String uapp) {
    java.lang.String queryJpql = java.lang.String.format("SELECT e FROM %s WHERE uid=:uid AND uapp=uapp", getEntityClass().getSimpleName());
    java.util.Map<java.lang.String, java.lang.Object> params = com.google.common.collect.ImmutableMap.<java.lang.String, java.lang.Object>builder().put("uid", uid).put("uapp", uapp).build();
    org.lnu.is.queries.Query<ENTITY> query = new org.lnu.is.queries.Query(getEntityClass(), queryJpql, params);
    return persistenceManager.getSingleResult(query);
}