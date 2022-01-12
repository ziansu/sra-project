public static java.lang.String refactor(java.lang.String sql, java.lang.String dbType, java.util.Map<java.lang.String, java.lang.String> tableMapping) {
    java.util.List<com.alibaba.druid.sql.ast.SQLStatement> stmtList = com.alibaba.druid.sql.SQLUtils.parseStatements(sql, dbType);
    return com.alibaba.druid.sql.SQLUtils.toSQLString(stmtList, dbType, null, null, tableMapping);
}