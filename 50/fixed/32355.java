private static java.sql.Connection getConnection() throws java.sql.SQLException {
    return com.jdbc.dao.JDBCMappingDAO.dataSource.getConnection();
}