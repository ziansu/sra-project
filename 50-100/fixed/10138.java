public static java.sql.Connection open() {
    java.sql.Connection c = null;
    try {
        java.lang.Class.forName("org.sqlite.JDBC");
        c = java.sql.DriverManager.getConnection("jdbc:sqlite:./bin/codeu/chat/codeU_db/ChatDatabase.db");
        c.setAutoCommit(false);
        java.lang.System.out.println("Opened database successfully");
    } catch (java.lang.Exception e) {
        java.lang.System.err.println((((e.getClass().getName()) + ": ") + (e.getMessage())));
        java.lang.System.exit(0);
    }
    return c;
}