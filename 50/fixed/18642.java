public void unlock() throws java.lang.Exception {
    java.sql.Connection conn = dataSource.getConnection();
    java.sql.PreparedStatement statement = conn.prepareStatement(edu.rit.lovelace.dao.CheckOutDAOImpl.reader.getQuery("unlockCheckout"));
    statement.executeQuery();
}