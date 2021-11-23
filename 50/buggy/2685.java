public void freeConnection(java.sql.Connection conn) {
    if (conn != null) {
        try {
            conn.close();
        } catch (java.lang.Exception e) {
            dbaware.DbConnector.logger.error("freeConnection exception", e);
        }
        conn = null;
    }
}