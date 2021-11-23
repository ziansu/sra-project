public java.sql.Connection connect() {
    conn = null;
    try {
        conn = java.sql.DriverManager.getConnection(url, dbProperties);
        java.lang.System.out.println("Connected to the PostgreSQL server successfully.");
        java.util.Date oldestDate = getOldestProcessedDay();
        if (this.foundDataToProcess(oldestDate)) {
            processHistory(oldestDate);
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
    return conn;
}