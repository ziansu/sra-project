public com.usbus.dal.model.Bus getByLocalId(long tenantId, java.lang.String busId) {
    if (!((tenantId > 0) || ((busId != null) && (!(busId.isEmpty()))))) {
        return null;
    }
    org.mongodb.morphia.query.Query<com.usbus.dal.model.Bus> query = ds.createQuery(com.usbus.dal.model.Bus.class);
    query.and(query.criteria("id").equal(busId), query.criteria("tenantId").equal(tenantId));
    return query.get();
}