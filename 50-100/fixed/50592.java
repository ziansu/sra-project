private java.sql.Connection getDatabaseConnection() {
    try {
        java.lang.Class.forName(Database.DatabaseHelper.JDBC_DRIVER);
        return java.sql.DriverManager.getConnection(Database.DatabaseHelper.DB_URL, "root", "");
    } catch (java.lang.ClassNotFoundException e) {
        java.lang.System.out.println("Things went wrong");
        e.printStackTrace();
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("Things went wrong");
        e.printStackTrace();
    }
    return null;
}