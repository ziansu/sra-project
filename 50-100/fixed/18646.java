public boolean userExists(java.lang.String username) throws pt.gov.dgarq.roda.common.convert.db.model.exception.ModuleException {
    boolean ret;
    try {
        java.sql.ResultSet result = getConnection().createStatement().executeQuery((("SELECT User FROM mysql.user WHERE User =  '" + username) + "'"));
        ret = result.next();
    } catch (java.sql.SQLException e) {
        throw new pt.gov.dgarq.roda.common.convert.db.model.exception.ModuleException((("Error checking if user " + username) + " exists"), e);
    }
    return ret;
}