byte[] putNamespaceSchemaEntity(org.apache.hadoop.hbase.NamespaceDescriptor nd) throws java.io.IOException {
    if (!(isIncludedNamespace(nd.getName()))) {
        return null;
    }
    org.commonvox.hbase_column_manager.Repository.RowId namespaceRowId = new org.commonvox.hbase_column_manager.Repository.RowId(SchemaEntityType.NAMESPACE.getRecordType(), org.commonvox.hbase_column_manager.Repository.NAMESPACE_PARENT_FOREIGN_KEY, org.apache.hadoop.hbase.util.Bytes.toBytes(nd.getName()));
    java.util.Map<byte[], byte[]> entityAttributeMap = buildEntityAttributeMap(org.commonvox.hbase_column_manager.Repository.EMPTY_VALUES, nd.getConfiguration());
    return putSchemaEntity(namespaceRowId.getByteArray(), entityAttributeMap, false);
}