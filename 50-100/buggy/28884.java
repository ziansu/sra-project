private void setLastInsertID() throws java.sql.SQLException {
    java.lang.String qry = "SELECT LAST_INSERT_ID()";
    eionet.meta.savers.DsTableHandler.LOGGER.debug(qry);
    java.sql.Statement stmt = conn.createStatement();
    java.sql.ResultSet rs = stmt.executeQuery(qry);
    rs.clearWarnings();
    if (rs.next()) {
        lastInsertID = rs.getString(1);
    }
    stmt.close();
}