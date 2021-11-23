public void insert(final java.lang.String key, final java.lang.String columnName, final java.lang.String value) {
    me.prettyprint.hector.api.factory.HFactory.createMutator(keyspace, serializer).insert(key, columnFamilyName, me.prettyprint.hector.api.factory.HFactory.createColumn(columnName, value, serializer, serializer));
}