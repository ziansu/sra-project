@java.lang.Override
public void delete(int id) throws java.io.IOException, java.lang.ClassNotFoundException, java.sql.SQLException {
    java.sql.Connection connection = operationManager.setConnection();
    java.lang.String sql = "DELETE FROM  APP.USERS WHERE id = " + id;
    operationManager.doQuery(sql);
    operationManager.closeConnection();
}