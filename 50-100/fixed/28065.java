public java.lang.Void executeDDL(java.lang.String sql) throws java.sql.SQLException {
    try {
        com.google.cloud.spanner.Operation<java.lang.Void, com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata> operation = adminClient.updateDatabaseDdl(instanceId, database, java.util.Arrays.asList(sql), null);
        operation = operation.waitFor();
        return operation.getResult();
    } catch (com.google.cloud.spanner.SpannerException e) {
        throw new java.sql.SQLException("Could not execute DDL statement", e);
    }
}