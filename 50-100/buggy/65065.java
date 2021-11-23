private void prepareAndAddToPreparedStatements(java.lang.String unpreparedStatementKey, java.lang.String unpreparedStatement, java.util.Map<java.lang.String, java.sql.CallableStatement> callableStatements) {
    try (java.sql.CallableStatement callableStatement = getConn().prepareCall(unpreparedStatement)) {
        callableStatements.put(unpreparedStatementKey, callableStatement);
    } catch (java.sql.SQLException e) {
        java.lang.String reason = ("There was an error while preparing callable SQL statement '" + unpreparedStatement) + "'";
        throw new amazon_product_metadata_parser.output.ProductOutputException(reason, e);
    }
}