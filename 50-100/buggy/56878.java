public void createTables(java.lang.String keyspace) {
    com.datastax.driver.core.Session session = getSession(keyspace);
    for (org.apache.jena.cassandra.graph.TableName tbl : org.apache.jena.cassandra.graph.CassandraConnection.getTableList()) {
        for (java.lang.String stmt : tbl.getCreateTableStatements(keyspace)) {
            org.apache.jena.cassandra.graph.CassandraConnection.LOG.debug(stmt);
            session.execute(stmt);
        }
    }
}