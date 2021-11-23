public void setTicket(java.lang.String player, int amount) {
    java.lang.String sql = java.lang.String.format("UPDATE %s SET %s = %d WHERE %s = \"%s\";", TABLE, TICKET, amount, PLAYER, player);
    try (java.sql.Statement statement = com.gmail.edenthink.tools.Driver.getConnection().createStatement()) {
        statement.executeUpdate(sql);
    } catch (java.sql.SQLException e) {
        com.gmail.edenthink.tools.Util.printSQLError(e);
    }
}