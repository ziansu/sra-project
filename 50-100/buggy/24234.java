public java.lang.String closeDB() {
    java.lang.String connStatus = null;
    try {
        if ((conn) != null) {
            conn.close();
        }
        conn = null;
    } catch (java.sql.SQLException e) {
        connStatus = "Failed to close database connection: " + e;
    }
    if ((conn) == null) {
        connStatus = "Successfully disconnected from database";
    }
    return connStatus;
}