@org.junit.Test
public void testGetMoreResults() throws java.lang.Exception {
    java.sql.PreparedStatement preparedStatement = org.easymock.EasyMock.createMock(java.sql.PreparedStatement.class);
    org.easymock.EasyMock.expect(preparedStatement.getMoreResults()).andReturn(java.lang.Boolean.TRUE);
    preparedStatement.close();
    org.easymock.EasyMock.replay(preparedStatement);
    com.j256.ormlite.jdbc.JdbcCompiledStatement stmt = new com.j256.ormlite.jdbc.JdbcCompiledStatement(preparedStatement, com.j256.ormlite.stmt.StatementBuilder.StatementType.SELECT, false);
    stmt.getMoreResults();
    stmt.close();
    org.easymock.EasyMock.verify(preparedStatement);
}