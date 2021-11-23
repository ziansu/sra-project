protected java.lang.Integer setTable(java.lang.String tableName, java.lang.String tablePropertiesSql) throws java.sql.SQLException {
    java.lang.String resultSql = "CREATE TABLE IF NOT EXISTS ";
    resultSql += tableName + " ";
    resultSql += tablePropertiesSql;
    return exeUpdate(resultSql);
}