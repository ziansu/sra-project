@java.lang.Override
public void setCharacterStream(int parameterIndex, java.io.Reader reader, int length) throws java.sql.SQLException {
    throw JDBCError.JDBC_FEATURE_NOT_SUPPORTED.raiseSQLException("java.sql.PreparedStatement.setCharacterStream(int, Reader, int)");
}