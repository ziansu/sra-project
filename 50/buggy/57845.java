public static java.lang.String toSQLString(java.util.List<com.alibaba.druid.sql.ast.SQLStatement> statementList, java.lang.String dbType, java.util.List<java.lang.Object> parameters, com.alibaba.druid.sql.SQLUtils.FormatOption option) {
    return com.alibaba.druid.sql.SQLUtils.toSQLString(statementList, dbType, parameters, option, null, false);
}