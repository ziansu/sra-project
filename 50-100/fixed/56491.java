public void addOrderInfoPictureItemOrder(int infoId, int pictureItemId) {
    try {
        java.lang.String sql = "insert into orderInfo_pictureItemOrder(id, info_id, pictureitem_id) " + "values (?, ?, ?)";
        java.sql.PreparedStatement ps = conn.prepareStatement(sql);
        ps.setNull(1, java.sql.Types.BIGINT);
        ps.setInt(2, infoId);
        ps.setInt(3, pictureItemId);
        ps.execute();
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(server.Databasemanager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}