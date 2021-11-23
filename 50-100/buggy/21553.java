public void deleteCustomer(int customerID) throws java.sql.SQLException {
    java.sql.Connection connection = null;
    java.sql.PreparedStatement statement = null;
    try {
        connection = new dataLayer.ConnectImpl().getConnection();
        statement = connection.prepareStatement(dataLayer.CustomerDAOImpl.DELETE_FROM_ID);
        statement.setInt(1, customerID);
        statement.execute();
        connection.commit();
    } finally {
        if (statement != null)
            statement.close();
        
    }
}