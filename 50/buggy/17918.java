@java.lang.Override
protected void printQueryString(com.datastax.driver.core.BoundStatement statement, com.datastax.driver.core.StatementFormatter.StatementWriter out, com.datastax.driver.core.StatementFormatter.StatementFormatVerbosity verbosity) {
    out.append(com.datastax.driver.core.StatementFormatter.StatementWriter.queryStringStart);
    out.appendQueryStringFragment(statement.preparedStatement().getQueryString());
    out.append(com.datastax.driver.core.StatementFormatter.StatementWriter.queryStringEnd);
}