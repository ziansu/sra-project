public void unlock() throws java.lang.Exception {
    try {
        java.sql.Connection conn = dataSource.getConnection();
        java.sql.PreparedStatement statement = conn.prepareStatement(edu.rit.lovelace.dao.CheckOutDAOImpl.reader.getQuery("unlockCheckout"));
        statement.executeQuery();
    } catch (java.sql.SQLException e) {
    }
}