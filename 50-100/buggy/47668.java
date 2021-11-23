public boolean deleteUser(java.lang.String username) {
    boolean result = false;
    try {
        java.sql.Connection conn = dataSource.getConnection();
        if ((this.getUser(username)) != null) {
            java.sql.PreparedStatement pstmt = conn.prepareStatement("DELETE FROM user WHERE username = ?");
            pstmt.setString(1, username);
            pstmt.executeQuery();
            result = true;
        }
        conn.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return result;
}