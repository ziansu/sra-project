@java.lang.SuppressWarnings(value = "finally")
public boolean isConnected() {
    boolean connected = false;
    try {
        connected = !(con.isClosed());
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    } finally {
        return connected;
    }
}