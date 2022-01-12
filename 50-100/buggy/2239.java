public void delete(java.lang.String columnName, java.lang.String... keys) {
    me.prettyprint.hector.api.mutation.Mutator<java.lang.String> m = me.prettyprint.hector.api.factory.HFactory.createMutator(keyspace, serializer);
    for (java.lang.String key : keys) {
        m.addDeletion(key, columnFamilyName, columnName, serializer);
    }
    m.execute();
}