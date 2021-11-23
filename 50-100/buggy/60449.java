private boolean checkForResultSet(java.sql.ResultSet resultSet, java.sql.Connection connection, java.sql.PreparedStatement watchedCheckStatement) {
    try {
        if (!(resultSet.next())) {
            closeAll(connection, watchedCheckStatement);
            return false;
        }
    } catch (java.sql.SQLException e) {
        am.aca.dao.impljdbc.ListDaoJdbc.LOGGER.warn(e.getMessage());
        throw new am.aca.dao.DaoException(e.getMessage());
    }
    return true;
}