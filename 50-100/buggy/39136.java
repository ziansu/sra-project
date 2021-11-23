public boolean databaseExists() throws pt.gov.dgarq.roda.common.convert.db.model.exception.ModuleException {
    boolean ret;
    try {
        java.sql.ResultSet result = getConnection(pt.gov.dgarq.roda.common.convert.db.modules.mySql.out.MYSQL_CONNECTION_DATABASE).createStatement().executeQuery((("SHOW DATABASES LIKE '" + (database)) + "'"));
        ret = result.next();
    } catch (java.sql.SQLException e) {
        throw new pt.gov.dgarq.roda.common.convert.db.model.exception.ModuleException((("Error checking if database " + (database)) + " exists"), e);
    }
    return ret;
}