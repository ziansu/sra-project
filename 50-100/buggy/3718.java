public boolean orderTimesReduce(java.lang.String player, java.lang.String orderNo) {
    int current = getRemain(player, orderNo);
    if (current < 1)
        return false;
    
    java.lang.String sql = java.lang.String.format("UPDATE %s SET %s = %d WHERE %s = \"%s\";", TABLE, orderNo, (current - 1), PLAYER, player);
    try (java.sql.Statement statement = com.gmail.edenthink.tools.Driver.getConnection().createStatement()) {
        statement.executeUpdate(sql);
    } catch (java.sql.SQLException e) {
        java.lang.System.err.print(com.gmail.edenthink.tools.Util.printSQLError(e));
    }
    return true;
}