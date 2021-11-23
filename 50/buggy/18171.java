public void close() throws java.sql.SQLException {
    conn.close();
    setClose();
}