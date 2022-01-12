@java.lang.Override
public void create(model.User user) throws java.io.IOException, java.lang.ClassNotFoundException, java.sql.SQLException {
    java.sql.Connection connection = operationManager.setConnection();
    java.lang.String sql = ((((("INSERT INTO USERS (id, firstname, lastname, age) VALUES ( DEFAULT, '" + (user.getFirstname())) + "', '") + (user.getLastname())) + "', ") + (user.getAge())) + ")";
    operationManager.doQuery(connection, sql);
    operationManager.closeConnection(connection);
}