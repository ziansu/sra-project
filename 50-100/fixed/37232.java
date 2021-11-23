@java.lang.Override
public void dispose() {
    if ((databaseProcess) != null) {
        databaseProcess.destroy();
    }
    java.lang.ProcessBuilder pb = new java.lang.ProcessBuilder(com.jeff.booktracker.db.DatabaseManager.DATABASE_SHUTDOWN_CMD, "/im", com.jeff.booktracker.db.DatabaseManager.DATABASE_START_CMD, "/f");
    try {
        pb.start();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.toString());
    }
}