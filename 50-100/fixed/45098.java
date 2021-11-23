@java.lang.Override
protected java.util.List<java.lang.Object> handleAssociations(com.impetus.kundera.metadata.model.EntityMetadata m, com.impetus.kundera.client.Client client, java.util.List<com.impetus.kundera.persistence.handler.impl.EntitySaveGraph> graphs, java.util.List<java.lang.String> relationNames, boolean isParent) {
    com.impetus.client.cassandra.query.CassQuery.log.debug("on handleAssociations rdbms query");
    java.util.List<org.apache.cassandra.thrift.IndexClause> ixClause = prepareIndexClause(m);
    ((com.impetus.client.cassandra.query.CassandraEntityReader) (getReader())).setConditions(ixClause);
    java.util.List<com.impetus.kundera.client.EnhanceEntity> ls = reader.populateRelation(m, relationNames, isParent, client);
    return handleGraph(ls, graphs, client, m);
}