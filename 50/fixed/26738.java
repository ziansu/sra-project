@java.lang.Override
public void disconnect() {
    try {
        connection.close();
        java.lang.System.out.println("DB connection closed!");
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e.getMessage());
    } finally {
        connection = null;
    }
}