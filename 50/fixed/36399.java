public final int executeUpdate(final java.lang.String request, final java.lang.Object... parameters) throws java.sql.SQLException {
    return statement.executeUpdate(java.lang.String.format(request, ((java.lang.Object[]) (parameters))));
}