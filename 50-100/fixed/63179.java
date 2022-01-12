public java.sql.ResultSet get(java.lang.String table, java.lang.String condition, java.lang.String joinTable, java.lang.String joinKey1, java.lang.String joinKey2) {
    java.lang.String sql = buildSelectQuery(table, condition, "*", ((((joinTable + " ON ") + joinKey1) + " = ") + joinKey2));
    return executeAndReturnResult(sql);
}