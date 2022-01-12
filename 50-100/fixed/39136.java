public boolean databaseExists() throws pt.gov.dgarq.roda.common.convert.db.model.exception.ModuleException {
    boolean ret;
    try {
        java.sql.ResultSet result = getConnection().createStatement().executeQuery((("SHOW DATABASES LIKE '" + (database)) + "'"));
        ret = result.next();
    } catch (java.sql.SQLException e) {
        throw new pt.gov.dgarq.roda.common.convert.db.model.exception.ModuleException((("Error checking if database " + (database)) + " exists"), e);
    }
    return ret;
}