@java.lang.Override
public void cleanup() {
    try {
        if ((connection) != null) {
            connection.commit();
            connection.close();
        }
    } catch (java.sql.SQLException e) {
    }
}