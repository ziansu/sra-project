public static java.sql.Connection getConnection() {
    java.sql.Connection connection = null;
    try {
        java.lang.Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = java.sql.DriverManager.getConnection(edu.sdsu.its.video_inv.DB.db_url, edu.sdsu.its.video_inv.DB.db_user, edu.sdsu.its.video_inv.DB.db_password);
    } catch (java.lang.Exception e) {
        edu.sdsu.its.video_inv.DB.LOGGER.fatal("Problem Initializing DB Connection", e);
    }
    return connection;
}