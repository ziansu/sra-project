public void tearDown() throws java.io.IOException, java.lang.InterruptedException, java.sql.SQLException {
    uk.ac.diamond.ispyb.api.ConnectionData data = new uk.ac.diamond.ispyb.api.ConnectionData();
    java.sql.Connection connection = connectToDatabase(data.getUrl(), data.getUser(), data.getPassword(), java.util.Optional.empty());
    try {
        org.springframework.jdbc.core.JdbcTemplate jdbcTemplate = new org.springframework.jdbc.core.JdbcTemplate(new org.springframework.jdbc.datasource.SingleConnectionDataSource(connection, true));
        jdbcTemplate.execute(java.lang.String.format("drop database if exists %s;", data.getSchema()));
    } finally {
        connection.close();
    }
}