@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testExecuteUpdateWithSelectType() throws java.lang.Exception {
    java.sql.PreparedStatement preparedStatement = org.easymock.EasyMock.createMock(java.sql.PreparedStatement.class);
    com.j256.ormlite.jdbc.JdbcCompiledStatement stmt = new com.j256.ormlite.jdbc.JdbcCompiledStatement(preparedStatement, com.j256.ormlite.stmt.StatementBuilder.StatementType.SELECT, false);
    stmt.runUpdate();
    stmt.close();
}