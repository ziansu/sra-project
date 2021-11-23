private java.sql.Connection createConnection() {
    java.sql.Connection connection = null;
    try {
        connection = java.sql.DriverManager.getConnection(lyit.oscar.insurance.MYSQLconnect.URL, lyit.oscar.insurance.MYSQLconnect.USER, lyit.oscar.insurance.MYSQLconnect.PASSWORD);
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("ERROR: Unable to Connect to Database.");
    }
    return connection;
}