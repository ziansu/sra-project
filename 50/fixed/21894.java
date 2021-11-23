public static org.traccar.database.QueryBuilder create(javax.sql.DataSource dataSource, java.lang.String query) throws java.sql.SQLException {
    return new org.traccar.database.QueryBuilder(dataSource, query, false);
}