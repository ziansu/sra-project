@org.testng.annotations.Test
public void translateInvalidIntegerExceptionDateTime() {
    javax.sql.DataSource dataSource = org.mockito.Mockito.mock(javax.sql.DataSource.class);
    org.molgenis.data.postgresql.PostgreSqlExceptionTranslator postgreSqlExceptionTranslator = new org.molgenis.data.postgresql.PostgreSqlExceptionTranslator(dataSource);
    org.postgresql.util.ServerErrorMessage serverErrorMessage = org.mockito.Mockito.mock(org.postgresql.util.ServerErrorMessage.class);
    org.mockito.Mockito.when(serverErrorMessage.getMessage()).thenReturn("invalid input syntax for type timestamp: \"str1\"");
    org.molgenis.data.validation.MolgenisValidationException e = org.molgenis.data.postgresql.PostgreSqlExceptionTranslator.translateInvalidIntegerException(new org.postgresql.util.PSQLException(serverErrorMessage));
    org.testng.Assert.assertEquals(e.getMessage(), "Value [str1] of this entity attribute is not of type [DATE_TIME].");
}