private boolean execute(java.sql.Connection connection, java.lang.String query) {
    try (java.sql.Statement statement = connection.createStatement();java.sql.ResultSet resultSet = statement.executeQuery(query)) {
        resultSet.next();
        return resultSet.getBoolean("result");
    } catch (java.sql.SQLException e) {
        throw new org.liquigraph.core.exception.ConditionExecutionException(("%nError executing condition:%n" + ("\tMake sure your query <%s> yields exactly one column named or aliased \'result\'.%n" + "\tActual cause: %s")), query, e.getMessage());
    }
}