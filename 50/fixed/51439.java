public void disconnect() throws java.sql.SQLException {
    if ((conn) != null) {
        conn.close();
        conn = null;
    }
}