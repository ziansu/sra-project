private void initConnections() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.Class.forName(mysqlDriver);
    for (int i = 0; i < (poolSize); i++) {
        java.sql.Connection connection = java.sql.DriverManager.getConnection(jdbcUrl, user, password);
        connections.add(connection);
    }
}