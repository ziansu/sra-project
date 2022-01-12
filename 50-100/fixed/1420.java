public java.sql.Connection connect() {
    conn = null;
    try {
        conn = java.sql.DriverManager.getConnection(url, dbProperties);
        java.lang.System.out.println("Connected to the PostgreSQL server successfully.");
        java.util.Date oldestDate = getOldestProcessedDay();
        while (this.foundDataToProcess(oldestDate)) {
            processHistory(oldestDate);
            oldestDate = getOldestProcessedDay();
        } 
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
    return conn;
}