@java.lang.Override
protected void after() {
    try {
        emptyDatabase();
        for (java.sql.Connection connection : connections) {
            if (!(connection.isClosed())) {
                try {
                    connection.close();
                } catch (java.sql.SQLException ignored) {
                }
            }
        }
    } catch (java.sql.SQLException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
}