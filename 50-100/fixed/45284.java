private static synchronized java.sql.PreparedStatement buildQuery(java.lang.String sql, java.lang.Object... args) {
    com.planb.support.utilities.Log.query(sql);
    java.sql.PreparedStatement statement = null;
    try {
        statement = com.planb.support.chatting.MySQL_Chat.connection.prepareStatement(sql);
        int placeholderCount = 1;
        for (java.lang.Object o : args) {
            statement.setObject((placeholderCount++), o);
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return statement;
}