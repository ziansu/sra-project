protected java.sql.ResultSet executeAndReturnResult(java.lang.String sql) {
    if ((connection) == null) {
        main.util.Log.error("Connection to database cannot be established.");
        return null;
    }
    try {
        java.sql.Statement statement = getStatement();
        statement.execute(sql);
        return statement.getResultSet();
    } catch (java.sql.SQLException e) {
        main.util.Log.error(((("Unable to perform query " + sql) + ": ") + e));
        return null;
    }
}