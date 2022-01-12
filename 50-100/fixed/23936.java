public java.sql.ResultSetMetaData getMetaData() throws java.sql.SQLException {
    checkOpen();
    boolean useLOBs = (((this) instanceof net.sourceforge.jtds.jdbc.CachedResultSet) && (statement.isClosed())) ? false : getConnection().getUseLOBs();
    return new net.sourceforge.jtds.jdbc.JtdsResultSetMetaData(columns, columnCount, useLOBs);
}