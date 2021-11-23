public int executeQuery(java.lang.String query) throws java.sql.SQLException {
    java.sql.Statement stmt = this._connection.createStatement();
    java.sql.ResultSet rs = stmt.executeQuery(query);
    int rowCount = 0;
    if (rs.next()) {
        rowCount++;
    }
    stmt.close();
    return rowCount;
}