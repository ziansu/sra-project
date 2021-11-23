@java.lang.Override
public void updateNotification(java.lang.String userName, core.Notification notification) {
    try (java.sql.Connection conn = ds.getConnection()) {
        try (java.sql.PreparedStatement stmt = conn.prepareStatement("Update notifications set seen = true where user_ID = ? and message = ?")) {
            core.Account acc = getAccountByName(userName);
            stmt.setInt(1, acc.getID());
            stmt.setString(2, notification.getMessage());
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}