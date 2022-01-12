public java.sql.ResultSet executeQuery(java.lang.String sql) throws java.sql.SQLException {
    try {
        query(sql);
        return _resultSet;
    } catch (java.lang.Exception e) {
        throw new java.sql.SQLException(e);
    }
}