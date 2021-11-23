private static void setConnection() {
    try {
        dbutils.DBUtils.config();
        java.lang.Class.forName("org.sqlite.JDBC");
        dbutils.DBUtils.con = java.sql.DriverManager.getConnection((((("jdbc:sqlite:" + (dbutils.DBUtils.workingDirectory)) + "/") + (dbutils.DBUtils.workingFile.getName())) + "/adress.db"));
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        java.lang.System.err.println("Плохое соединение");
    }
}