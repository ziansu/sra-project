@java.lang.Override
public boolean execute(java.lang.String sql) throws java.sql.SQLException {
    ensureNotClosed();
    execute0(sql, null);
    return rs.isQuery();
}