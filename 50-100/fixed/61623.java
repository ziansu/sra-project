public void storeTimestamp(java.sql.Timestamp t) {
    try {
        java.lang.String insertStmt = ("insert into " + (TABLE)) + " (TIME_STAMP) values (?) ";
        if ((database.connection) != null) {
            java.sql.PreparedStatement statement = database.connection.prepareStatement(insertStmt);
            statement.setTimestamp(1, t);
            statement.executeQuery();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}