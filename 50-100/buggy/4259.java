private void getTableSchema(com.project.api.oraclesql.Table table) {
    queryString.append(((table.getSchema()) == null ? table.getTableName() : ((table.getSchema().getSchemaName()) + ".") + (table.getTableName())));
}