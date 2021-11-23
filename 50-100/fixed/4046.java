public synchronized java.util.List<java.lang.String> findAllPeeps() throws java.lang.Exception {
    org.ehcache.demos.peeper.DataStore.LOGGER.info("Loading peeps from DB");
    java.util.List<java.lang.String> result = new java.util.ArrayList<>();
    try (java.sql.Statement statement = connection.createStatement()) {
        try (java.sql.ResultSet resultSet = statement.executeQuery("SELECT * FROM PEEPS")) {
            while (resultSet.next()) {
                java.lang.String peepText = resultSet.getString("PEEP_TEXT");
                result.add(peepText);
            } 
        }
    }
    return result;
}