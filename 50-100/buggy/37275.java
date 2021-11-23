private byte[] putColumnAuditorSchemaEntity(byte[] colFamilyForeignKey, org.commonvox.hbase_column_manager.ColumnAuditor columnAuditor) throws java.io.IOException {
    java.util.Map<byte[], byte[]> entityAttributeMap = buildEntityAttributeMap(columnAuditor.getValues(), columnAuditor.getConfiguration());
    return putSchemaEntity(new org.commonvox.hbase_column_manager.Repository.RowId(SchemaEntityType.COLUMN_AUDITOR.getRecordType(), colFamilyForeignKey, columnAuditor.getName()).getByteArray(), entityAttributeMap, false);
}