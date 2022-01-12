public static java.sql.Connection getConnection() {
    java.sql.Connection conn = null;
    try {
        java.lang.Class.forName(Constants.Database.driver);
        conn = java.sql.DriverManager.getConnection(Constants.Database.url, Constants.Database.userName, Constants.Database.password);
        java.lang.System.out.println("Connected to the database");
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
    return conn;
}