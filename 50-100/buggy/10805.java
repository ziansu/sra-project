public java.sql.Connection connect() {
    java.sql.Connection conn = null;
    try {
        java.lang.Class.forName("org.sqlite.JDBC");
        conn = java.sql.DriverManager.getConnection(SqliteConnection.url);
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e.getMessage());
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    } finally {
        return conn;
    }
}