public boolean intiateDBConnection() {
    try {
        java.lang.Class.forName("org.sqlite.JDBC");
        con = java.sql.DriverManager.getConnection((("jdbc:sqlite:" + (property)) + "/ProjectTest.db"), "", "");
        return true;
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        java.lang.System.out.println("exception caught");
        return false;
    }
}