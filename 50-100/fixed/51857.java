private boolean isUsersEmpty() throws by.tr.library.dao.exception.DAOException {
    boolean result = false;
    try (java.sql.Connection connection = by.tr.library.pool.ConnectionPool.getInstance().getConnection();java.sql.Statement statement = connection.createStatement()) {
        java.sql.ResultSet set = statement.executeQuery(by.tr.library.dao.impl.SQLCommonDao.SELECT_USERS);
        if (!(set.next())) {
            result = true;
        }
    } catch (java.sql.SQLException e) {
        throw new by.tr.library.dao.exception.DAOException("Select users dao exception", e);
    }
    return result;
}