@java.lang.Override
public void deleteAllUsers() {
    java.sql.PreparedStatement stmt = null;
    java.sql.ResultSet keyRS = null;
    try {
        java.lang.String insertQuery = "DELETE FROM User";
        stmt = db.getConnect().prepareStatement(insertQuery);
        stmt.executeUpdate();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            stmt.close();
            keyRS.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}