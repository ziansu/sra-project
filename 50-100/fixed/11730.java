public static boolean logoutUser(int sessionID) {
    java.lang.String sql = "DELETE FROM Session WHERE SessionID = ?";
    try (java.sql.PreparedStatement stmt = bankserver.DBConnector.connection.prepareStatement(sql)) {
        stmt.setInt(1, sessionID);
        stmt.executeQuery();
        return true;
    } catch (java.sql.SQLException e) {
        java.util.logging.Logger.getLogger(bankserver.DBConnector.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
    }
    return false;
}