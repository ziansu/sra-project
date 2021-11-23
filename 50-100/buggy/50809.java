protected void appendOrder(java.lang.String columnName, int order) {
    orderByList.add((order == (com.fsryan.forsuredb.api.OrderBy.ORDER_ASC) ? com.fsryan.forsuredb.api.sqlgeneration.Sql.generator().orderByAsc(tableName, columnName) : com.fsryan.forsuredb.api.sqlgeneration.Sql.generator().orderByDesc(tableName, columnName)));
}