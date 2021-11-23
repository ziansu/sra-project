public boolean exists(java.lang.String key) throws java.sql.SQLException, org.pi.litepost.databaseAccess.DatabaseCriticalErrorException {
    if ((sessionId) != null) {
        java.sql.ResultSet rs = model.getQueryManager().executeQuery("sessionKeyExists", sessionId, key);
        return (rs.next()) && ((rs.getInt(0)) != 0);
    }
    return false;
}