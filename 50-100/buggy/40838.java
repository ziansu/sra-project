private byte[] putColumnFamilySchemaEntity(byte[] tableForeignKey, org.apache.hadoop.hbase.HColumnDescriptor hcd, org.apache.hadoop.hbase.TableName tableName) throws java.io.IOException {
    java.util.Map<byte[], byte[]> entityAttributeMap = buildEntityAttributeMap(hcd.getValues(), hcd.getConfiguration());
    return putSchemaEntity(new org.commonvox.hbase_column_manager.Repository.RowId(SchemaEntityType.COLUMN_FAMILY.getRecordType(), tableForeignKey, hcd.getName()).getByteArray(), entityAttributeMap, false);
}