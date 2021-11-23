@java.lang.Override
public java.sql.ResultSet executeQuery(java.lang.String sql) throws java.sql.SQLException {
    execute0(sql);
    java.sql.ResultSet rs = getResultSet();
    if (rs == null)
        throw new java.sql.SQLException(("The query isn't SELECT query: " + sql));
    
    return rs;
}