@java.lang.SuppressWarnings(value = "unused")
public synchronized boolean verifyAccountExists(java.lang.String username) {
    try (java.sql.Connection conn = ds.getConnection()) {
        try (java.sql.PreparedStatement selectPassword = conn.prepareStatement(database.Connector.SQL_SELECT_PASSWORD)) {
            selectPassword.setString(1, username);
            try (java.sql.ResultSet resultPassword = selectPassword.executeQuery()) {
                if (resultPassword.next()) {
                    return true;
                }
                return false;
            }
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return false;
    }
}