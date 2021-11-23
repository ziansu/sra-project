@java.lang.Override
public java.sql.ResultSet select(java.lang.String table, java.lang.String where) {
    connect();
    try {
        java.sql.Statement statement = connection.createStatement();
        return statement.executeQuery(((("SELECT * FROM " + table) + " ") + where));
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    } finally {
        close();
    }
    return null;
}