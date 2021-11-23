public java.sql.Connection createConnection(java.lang.String URL, java.lang.String USER, java.lang.String PASS) {
    java.sql.Connection connection = null;
    try {
        connection = java.sql.DriverManager.getConnection(URL, USER, PASS);
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("ERROR: Unable to Connect to Database.");
    }
    return connection;
}