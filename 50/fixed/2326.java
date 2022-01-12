public final java.sql.ResultSet executeQuery(final java.lang.String request, final java.lang.Object... parameters) throws java.sql.SQLException {
    return statement.executeQuery(java.lang.String.format(request, ((java.lang.Object[]) (parameters))));
}