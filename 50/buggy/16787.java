public static java.lang.String toSQLString(com.alibaba.druid.sql.ast.SQLObject sqlObject, java.lang.String dbType) {
    return com.alibaba.druid.sql.SQLUtils.toSQLString(sqlObject, dbType, null, false);
}