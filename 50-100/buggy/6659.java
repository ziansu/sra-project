public java.sql.ResultSet doQuery(java.lang.String query, java.lang.String... args) throws java.sql.SQLException {
    java.sql.PreparedStatement stmt = con.prepareStatement(query);
    for (int i = 0; i < (args.length); i++) {
        stmt.setString((i + 1), args[i]);
    }
    return stmt.executeQuery(query);
}