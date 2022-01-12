public java.util.Map<java.lang.String, org.polyjdbc.core.schema.model.Schema> allTablesSchema(org.polyjdbc.core.dialect.Dialect dialect) {
    java.util.Map<java.lang.String, org.polyjdbc.core.schema.model.Schema> schema = new java.util.TreeMap<>();
    schema.put(org.javers.repository.sql.schema.FixedSchemaFactory.GLOBAL_ID_TABLE_NAME, globalIdTableSchema(dialect, org.javers.repository.sql.schema.FixedSchemaFactory.GLOBAL_ID_TABLE_NAME));
    schema.put(org.javers.repository.sql.schema.FixedSchemaFactory.COMMIT_TABLE_NAME, commitTableSchema(dialect, org.javers.repository.sql.schema.FixedSchemaFactory.COMMIT_TABLE_NAME));
    schema.put(org.javers.repository.sql.schema.FixedSchemaFactory.COMMIT_PROPERTY_TABLE_NAME, commitPropertiesTableSchema(dialect, org.javers.repository.sql.schema.FixedSchemaFactory.COMMIT_PROPERTY_TABLE_NAME));
    schema.put(org.javers.repository.sql.schema.FixedSchemaFactory.SNAPSHOT_TABLE_NAME, snapshotTableSchema(dialect, org.javers.repository.sql.schema.FixedSchemaFactory.SNAPSHOT_TABLE_NAME));
    return schema;
}