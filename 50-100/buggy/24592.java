@org.testng.annotations.Test(expectedExceptions = java.lang.RuntimeException.class)
public void translateNotNullViolationBadMessage() {
    javax.sql.DataSource dataSource = org.mockito.Mockito.mock(javax.sql.DataSource.class);
    org.molgenis.data.postgresql.PostgreSqlExceptionTranslator postgreSqlExceptionTranslator = new org.molgenis.data.postgresql.PostgreSqlExceptionTranslator(dataSource);
    org.postgresql.util.ServerErrorMessage serverErrorMessage = org.mockito.Mockito.mock(org.postgresql.util.ServerErrorMessage.class);
    org.mockito.Mockito.when(serverErrorMessage.getSQLState()).thenReturn("23502");
    org.mockito.Mockito.when(serverErrorMessage.getTable()).thenReturn("mytable");
    org.mockito.Mockito.when(serverErrorMessage.getMessage()).thenReturn("xxxyyyzzzz");
    postgreSqlExceptionTranslator.translateNotNullViolation(new org.postgresql.util.PSQLException(serverErrorMessage));
}