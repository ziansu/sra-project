public static java.sql.ResultSet executeQuery(java.lang.String sql) {
    try {
        java.lang.Class.forName("com.mysql.jdbc.Driver");
        try (java.sql.Connection connection = java.sql.DriverManager.getConnection(sample.SQLHandler.url, sample.SQLHandler.username, sample.SQLHandler.password)) {
            java.sql.Statement stmt = connection.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            connection.close();
            return rs;
        } catch (java.sql.SQLException e) {
            throw new java.lang.IllegalStateException("Cannot connect the database!", e);
        }
    } catch (java.lang.ClassNotFoundException e) {
        throw new java.lang.IllegalStateException("Cannot find the driver in the classpath!", e);
    }
}