@org.jetbrains.annotations.Nullable
java.sql.Connection getConnection() {
    try {
        return connectionPool.getConnection();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return null;
}