@java.lang.Override
public int delete(org.polyjdbc.core.query.DeleteQuery deleteQuery) {
    org.polyjdbc.core.query.Query rawQuery = deleteQuery.build();
    try (java.sql.PreparedStatement statement = rawQuery.createStatementWithValues(transaction)) {
        return transaction.executeUpdate(statement);
    } catch (java.sql.SQLException exception) {
        transaction.rollback();
        throw new org.polyjdbc.core.exception.QueryExecutionException("DELETE_ERROR", java.lang.String.format("Failed to run delete query:%n%s", rawQuery.getQuery()), exception);
    }
}