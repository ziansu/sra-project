private com.spinalcraft.slipdisk.Profile getProfile(java.lang.String username) {
    java.lang.String query = "SELECT uuid FROM slip_users WHERE username = ?";
    java.sql.PreparedStatement stmt;
    try {
        stmt = com.spinalcraft.spinalpack.Spinalpack.prepareStatement(query);
        stmt.setString(1, username);
        java.sql.ResultSet rs = stmt.executeQuery();
        if (!(rs.first()))
            return null;
        
        return getProfile(java.util.UUID.fromString(rs.getString("uuid")));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return null;
}