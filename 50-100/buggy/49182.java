@java.lang.Override
protected java.util.List<java.lang.Object> populateEntities(com.impetus.kundera.metadata.model.EntityMetadata m, com.impetus.kundera.client.Client client) {
    com.impetus.client.cassandra.query.CassQuery.log.debug("on populateEntities cassandra query");
    java.util.List<java.lang.Object> result = null;
    if (com.impetus.kundera.metadata.MetadataUtils.useSecondryIndex(m.getPersistenceUnit())) {
        java.util.List<org.apache.cassandra.thrift.IndexClause> ixClause = prepareIndexClause();
        result = ((com.impetus.client.cassandra.pelops.PelopsClient) (client)).find(ixClause, m, false, null);
    }else {
        result = populateUsingLucene(m, client, result);
    }
    return result;
}