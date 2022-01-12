public void insert(final java.lang.String key, final java.lang.String columnName, final java.lang.String value) {
    createMutator(keyspace, serializer).insert(key, columnFamilyName, createColumn(columnName, value, serializer, serializer));
}