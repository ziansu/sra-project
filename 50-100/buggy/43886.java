private void openConnection() {
    try {
        java.lang.Class.forName("org.sqlite.JDBC");
        dbConnection = java.sql.DriverManager.getConnection("jdbc:sqlite:SuperLeeDB.db");
        dbConnection.setAutoCommit(false);
    } catch (java.lang.Exception e) {
        java.lang.System.err.println((((e.getClass().getName()) + ": ") + (e.getMessage())));
        java.lang.System.exit(0);
    }
}