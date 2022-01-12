public boolean intiateDBConnection() {
    try {
        java.lang.Class.forName("org.sqlite.JDBC");
        con = java.sql.DriverManager.getConnection((("jdbc:sqlite:" + (property)) + "/ProjectTest.db"), "", "");
        insertUser(new chatboxserver.User("ehab", "jgfg", "23", "23232", "ehab", "jgfg", "23", "23232", "3434"));
        chatboxserver.User user = getUser("ajkshkajshfjkah");
        return true;
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        java.lang.System.out.println("exception caught");
        return false;
    }
}