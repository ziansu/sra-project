public void newPlayer(java.lang.String player) {
    java.lang.String sql = java.lang.String.format("INSERT INTO %s (%s) VALUES (\"%s\");", TABLE, PLAYER, player);
    try (java.sql.Statement statement = com.gmail.edenthink.tools.Driver.getConnection().createStatement()) {
        statement.executeUpdate(sql);
    } catch (java.sql.SQLException e) {
        if ((e.getErrorCode()) != 0) {
            java.lang.System.err.print(com.gmail.edenthink.tools.Util.printSQLError(e));
        }
    }
}