private java.sql.Connection createConnection() {
    java.sql.Connection connection = null;
    try {
        connection = java.sql.DriverManager.getConnection(nl.hu.tho6.persistence.connection.ConnectionFactory.URL, nl.hu.tho6.persistence.connection.ConnectionFactory.USER, nl.hu.tho6.persistence.connection.ConnectionFactory.PASSWORD);
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("ERROR: Unable to Connect to Database.");
    }
    return connection;
}