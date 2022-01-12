public boolean disconnect() {
    if ((dbConnection) != null) {
        try {
            dbConnection.close();
        } catch (java.sql.SQLException sqle) {
            log.error(("SQLException occurred while disconnecting from user database... " + (sqle.getMessage())));
            return false;
        }
    }
    return true;
}