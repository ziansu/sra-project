private void connection() {
    com.family.account.libraries.DataBase.conn = null;
    try {
        java.lang.Class.forName("org.sqlite.JDBC");
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
    }
    try {
        com.family.account.libraries.DataBase.conn = java.sql.DriverManager.getConnection(("jdbc:sqlite:" + (path)));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}