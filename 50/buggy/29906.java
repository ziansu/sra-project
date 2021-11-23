public int executeUpdate(java.sql.Statement st, java.lang.String sql) throws java.sql.SQLException {
    this.st = st;
    return st.executeUpdate(sql, columnName);
}