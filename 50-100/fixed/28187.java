public void insertMulti(java.lang.String columnName, java.util.Map<java.lang.String, java.lang.String> keyValues) {
    me.prettyprint.hector.api.mutation.Mutator<java.lang.String> m = createMutator(keyspace, serializer);
    for (java.util.Map.Entry<java.lang.String, java.lang.String> keyValue : keyValues.entrySet()) {
        m.addInsertion(keyValue.getKey(), columnFamilyName, createColumn(columnName, keyValue.getValue(), keyspace.createClock(), serializer, serializer));
    }
    m.execute();
}