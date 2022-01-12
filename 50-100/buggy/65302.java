public int connect() {
    try {
        java.lang.Class.forName("bolDemo.database.jeroenmathon.dbMgr");
        conn = java.sql.DriverManager.getConnection(("jdbc:sqlite:" + (path)));
    } catch (java.lang.Exception e) {
        java.lang.System.err.println((((e.getClass().getName()) + ": ") + (e.getMessage())));
        return -1;
    }
    java.lang.System.out.println("Opened database successfully");
    return 0;
}