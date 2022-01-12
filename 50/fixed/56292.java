@java.lang.Override
public void registerSchemas(org.apache.drill.exec.store.SchemaConfig schemaConfig, org.apache.calcite.schema.SchemaPlus parent) throws java.io.IOException {
    org.apache.drill.exec.store.openTSDB.schema.OpenTSDBSchemaFactory.OpenTSDBTables schema = new org.apache.drill.exec.store.openTSDB.schema.OpenTSDBSchemaFactory.OpenTSDBTables(schemaName);
    parent.add(schemaName, schema);
}