@java.lang.Override
public int update(org.polyjdbc.core.query.UpdateQuery updateQuery) {
    org.polyjdbc.core.query.Query rawQuery = updateQuery.build();
    try (java.sql.PreparedStatement statement = rawQuery.createStatementWithValues(transaction)) {
        return transaction.executeUpdate(statement);
    } catch (java.sql.SQLException exception) {
        transaction.rollback();
        throw new org.polyjdbc.core.exception.QueryExecutionException("UPDATE_ERROR", java.lang.String.format("Failed to run update query:%n%s", rawQuery.getQuery()), exception);
    }
}