public java.sql.Connection getConnection() {
    if (isClosed()) {
        com.Ben12345rocks.AdvancedCore.AdvancedCoreHook.getInstance().debug("Connection closed... opening....");
        open();
    }
    try {
        return dataSource.getConnection();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return null;
}