public void deleteCustomer(java.sql.Connection connection, int customerID) throws java.sql.SQLException {
    java.sql.PreparedStatement statement = null;
    try {
        statement = connection.prepareStatement(dataLayer.CustomerDAOImpl.DELETE_FROM_ID);
        statement.setInt(1, customerID);
        statement.execute();
        connection.commit();
    } finally {
        if (statement != null)
            statement.close();
        
    }
}