public boolean executeUpdateStatement(java.lang.String query) {
    boolean result = false;
    if ((query != null) && (connectionIsOpen())) {
        try {
            statement.executeUpdate(query);
            result = true;
        } catch (java.sql.SQLException e) {
            java.lang.System.out.println(e);
            result = false;
        }
    }
    return result;
}