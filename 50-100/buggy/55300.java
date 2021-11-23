public java.util.List<com.lumens.model.Element> executeQuery(java.lang.String SQL, com.lumens.connector.database.client.oracle.OracleElementBuilder elementBuilder, com.lumens.model.Format output) {
    java.sql.Statement stat = null;
    java.sql.ResultSet ret = null;
    try {
        stat = conn.createStatement();
        ret = stat.executeQuery(SQL);
        return elementBuilder.buildElement(output, ret);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    } finally {
        com.lumens.connector.database.DbUtils.releaseResultSet(ret);
        com.lumens.connector.database.DbUtils.releaseStatement(stat);
    }
}