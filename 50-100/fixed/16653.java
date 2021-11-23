public static java.lang.String format(java.lang.String sql, java.lang.String dbType, java.util.List<java.lang.Object> parameters, com.alibaba.druid.sql.SQLUtils.FormatOption option) {
    try {
        com.alibaba.druid.sql.SQLStatementParser parser = com.alibaba.druid.sql.SQLParserUtils.createSQLStatementParser(sql, dbType);
        parser.setKeepComments(true);
        java.util.List<com.alibaba.druid.sql.ast.SQLStatement> statementList = parser.parseStatementList();
        return com.alibaba.druid.sql.SQLUtils.toSQLString(statementList, dbType, parameters, option);
    } catch (com.alibaba.druid.sql.ParserException ex) {
        com.alibaba.druid.sql.SQLUtils.LOG.warn("format error", ex);
        return sql;
    }
}