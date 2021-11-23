public synchronized java.sql.ResultSet query(final java.lang.String sql, final java.lang.Object[] parameters) {
    final java.sql.PreparedStatement statement = prepare(sql, parameters, false);
    if (statement != null) {
        try {
            final java.sql.ResultSet result = statement.executeQuery();
            result.close();
            connection.commit();
            return result;
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            attemptRollback();
        }
    }
    return null;
}