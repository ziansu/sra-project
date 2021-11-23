public java.sql.ResultSet getTableTypes() throws java.sql.SQLException {
    checkOpen();
    return execute(("select 'TABLE' as TABLE_TYPE " + "union select 'VIEW' as TABLE_TYPE;"));
}