public final int executeUpdate(java.lang.String request, final java.lang.Object... parameters) throws java.sql.SQLException {
    request = java.lang.String.format(request, ((java.lang.Object[]) (parameters)));
    return statement.executeUpdate(request);
}