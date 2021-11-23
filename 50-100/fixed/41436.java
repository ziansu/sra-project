@java.lang.Override
protected void after() {
    try {
        emptyDatabase();
        for (java.sql.Connection connection : connections) {
            if (!(connection.isClosed())) {
                connection.close();
            }
        }
    } catch (java.sql.SQLException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
}