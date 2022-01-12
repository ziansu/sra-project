public void resetOrderTimes() {
    java.lang.String sql = java.lang.String.format("UPDATE %s SET %s = 3, %s = 3, %s = 3", TABLE, ORDER_ONE, ORDER_TWO, ORDER_THREE);
    try (java.sql.Statement statement = com.gmail.edenthink.tools.Driver.getConnection().createStatement()) {
        statement.executeUpdate(sql);
    } catch (java.sql.SQLException e) {
        com.gmail.edenthink.tools.Util.printSQLError(e);
    }
}