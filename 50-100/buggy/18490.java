private static org.molgenis.data.MolgenisDataException doTranslate(org.postgresql.util.PSQLException pSqlException) {
    switch (pSqlException.getSQLState()) {
        case "22007" :
        case "22P02" :
            return org.molgenis.data.postgresql.PostgreSqlExceptionTranslator.translateInvalidIntegerException(pSqlException);
        case "23502" :
            return org.molgenis.data.postgresql.PostgreSqlExceptionTranslator.translateNotNullViolation(pSqlException);
        case "23503" :
            return org.molgenis.data.postgresql.PostgreSqlExceptionTranslator.translateForeignKeyViolation(pSqlException);
        case "23505" :
            return org.molgenis.data.postgresql.PostgreSqlExceptionTranslator.translateUniqueKeyViolation(pSqlException);
        case "23514" :
            return translateCheckConstraintViolation(pSqlException);
        default :
            return null;
    }
}