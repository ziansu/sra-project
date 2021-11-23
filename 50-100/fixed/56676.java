public java.lang.Integer getNewModifiedPictureId() {
    try {
        java.lang.String sql = "select COALESCE(MAX(id), 0) from modifiedPicture";
        java.sql.PreparedStatement ps = conn.prepareStatement(sql);
        java.sql.ResultSet srs = ps.executeQuery();
        while (srs.next()) {
            return (srs.getInt(1)) + 1;
        } 
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(server.Databasemanager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return null;
}