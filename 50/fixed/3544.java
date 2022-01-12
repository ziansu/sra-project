public void releaseConnection() {
    try {
        if ((connection) != null)
            connection.close();
        
        connection = null;
    } catch (java.sql.SQLException e) {
    }
    for (io.lightlink.facades.SQLFacade childInstance : childInstances) {
        childInstance.releaseConnection();
    }
}