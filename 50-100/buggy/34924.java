private void prepare(java.lang.String cql, com.datastax.driver.core.policies.RetryPolicy petryPolicy) {
    org.copperengine.core.persistent.cassandra.CassandraStorage.logger.info("Preparing cql stmt {}", cql);
    com.datastax.driver.core.PreparedStatement pstmt = session.prepare(cql);
    pstmt.setConsistencyLevel(consistencyLevel);
    pstmt.setRetryPolicy(alwaysRetry);
    preparedStatements.put(cql, pstmt);
}