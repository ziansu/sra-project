public void addModifiedPicture(int id, int pictureId) {
    try {
        java.lang.String sql = "insert into modifiedPicture(id, picture_id) values (?, ?)";
        java.sql.PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setInt(2, pictureId);
        ps.executeQuery();
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(server.Databasemanager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}