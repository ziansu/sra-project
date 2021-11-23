public static java.sql.Connection getStoredConnection(javax.servlet.ServletRequest request) {
    java.sql.Connection conn = ((java.sql.Connection) (request.getAttribute(ultis.MyUtils.ATT_NAME_CONNECTION)));
    return conn;
}