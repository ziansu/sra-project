@java.lang.Override
protected java.util.Map<java.lang.String, org.apache.calcite.schema.Table> getTableMap() {
    final com.google.common.collect.ImmutableMap.Builder<java.lang.String, org.apache.calcite.schema.Table> builder = com.google.common.collect.ImmutableMap.builder();
    for (java.lang.String name : dstream.SdbSchemaFactory.get().getTables()) {
        builder.put(name, createTable(name));
    }
    return builder.build();
}