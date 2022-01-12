public int deleteSendDatagrams() throws java.sql.SQLException {
    getConnection().setAutoCommit(false);
    java.lang.String sql = "DELETE FROM DATAGRAMS WHERE ID in (select datagram_id from Datagram_statistics where is_send = 'TRUE')";
    java.sql.PreparedStatement ps = getConnection().prepareStatement(sql);
    int deleted = ps.executeUpdate();
    ps.close();
    getConnection().commit();
    getConnection().setAutoCommit(true);
    return deleted;
}