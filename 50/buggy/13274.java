public boolean checkSqlQuery(java.lang.String sql) throws net.sf.jsqlparser.JSQLParserException {
    java.lang.System.out.println(("SQL: " + sql));
    net.sf.jsqlparser.statement.Statement statement = parserManager.parse(new java.io.StringReader(sql));
    return true;
}