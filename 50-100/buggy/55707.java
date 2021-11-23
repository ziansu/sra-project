@org.junit.Test
public void testSetNull() throws java.lang.Exception {
    java.sql.PreparedStatement preparedStatement = org.easymock.EasyMock.createMock(java.sql.PreparedStatement.class);
    preparedStatement.setNull(1, com.j256.ormlite.jdbc.TypeValMapper.getTypeValForSqlType(SqlType.STRING));
    org.easymock.EasyMock.expectLastCall();
    preparedStatement.close();
    org.easymock.EasyMock.replay(preparedStatement);
    com.j256.ormlite.jdbc.JdbcCompiledStatement stmt = new com.j256.ormlite.jdbc.JdbcCompiledStatement(preparedStatement, com.j256.ormlite.stmt.StatementBuilder.StatementType.SELECT);
    stmt.setObject(0, null, SqlType.STRING);
    stmt.close();
    org.easymock.EasyMock.verify(preparedStatement);
}