public static java.sql.Connection open() {
    try {
        java.lang.Class.forName("org.sqlite.JDBC");
        codeu.chat.codeU_db.DataBaseConnection.c = java.sql.DriverManager.getConnection("jdbc:sqlite:./bin/codeu/chat/codeU_db/ChatDatabase.db");
        codeu.chat.codeU_db.DataBaseConnection.c.setAutoCommit(false);
        java.lang.System.out.println("Opened database successfully");
    } catch (java.lang.Exception e) {
        java.lang.System.err.println((((e.getClass().getName()) + ": ") + (e.getMessage())));
        java.lang.System.exit(0);
    }
    return codeu.chat.codeU_db.DataBaseConnection.c;
}