public boolean isConnected() {
    boolean connected = false;
    try {
        connected = !(con.isClosed());
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return connected;
}