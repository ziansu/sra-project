private static boolean tablesExist(java.sql.Connection connection) throws java.sql.SQLException {
    try (java.sql.ResultSet resultSet = connection.prepareStatement("SELECT COUNT(*) FROM INFORMATION_SCHEMA.SYSTEM_TABLES WHERE TABLE_TYPE='TABLE'").executeQuery()) {
        resultSet.next();
        int numberOfTables = resultSet.getInt(1);
        org.syncany.database.DatabaseConnectionFactory.logger.log(java.util.logging.Level.INFO, (("Found " + numberOfTables) + " tables."));
        return numberOfTables == 12;
    }
}