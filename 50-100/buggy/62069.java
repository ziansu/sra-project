@java.lang.Override
protected java.util.Map<java.lang.String, org.apache.calcite.schema.Table> getTableMap() {
    dstream.SdbSchema.log.info("get Table map");
    final com.google.common.collect.ImmutableMap.Builder<java.lang.String, org.apache.calcite.schema.Table> builder = com.google.common.collect.ImmutableMap.builder();
    for (java.lang.String name : dstream.SdbSchemaFactory.get().getTables()) {
        dstream.SdbSchema.log.info("name {}", name);
        builder.put("SALES", createTable(null));
    }
    return builder.build();
}