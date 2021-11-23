public java.sql.ResultSet execute(java.lang.String request) throws java.lang.Exception {
    java.sql.Statement stmt = connection.createStatement();
    stmt.closeOnCompletion();
    java.sql.ResultSet res = stmt.executeQuery(request);
    return res;
}