public static java.lang.String toSQLString(java.util.List<com.alibaba.druid.sql.ast.SQLStatement> statementList, java.lang.String dbType, java.util.List<java.lang.Object> parameters) {
    return com.alibaba.druid.sql.SQLUtils.toSQLString(statementList, dbType, parameters, com.alibaba.druid.sql.SQLUtils.DEFAULT_LCASE_FORMAT_OPTION, null, false);
}