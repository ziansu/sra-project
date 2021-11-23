public static java.sql.Connection getConn() throws java.io.FileNotFoundException, java.io.IOException, java.sql.SQLException {
    java.util.Properties pro = new java.util.Properties();
    java.sql.Connection conn = null;
    pro = pokerface.Sad.util.DBUtil.getProperties();
    conn = java.sql.DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("user"), pro.getProperty("password"));
    return conn;
}