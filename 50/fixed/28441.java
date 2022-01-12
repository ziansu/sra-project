public static synchronized java.sql.Connection getConnection() {
    if ((com.kpi.magazines.database.ConnectionManager.pool.size()) != 0) {
        return com.kpi.magazines.database.ConnectionManager.pool.poll();
    }
    return com.kpi.magazines.database.ConnectionManager.createConnection();
}