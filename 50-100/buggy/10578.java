private void postSecretMessage(ndbc.Message secret, java.sql.Connection connection) {
    try (java.sql.Statement statement = connection.createStatement()) {
        java.lang.System.out.println(secret.sender);
        java.lang.String queryString = "INSERT INTO d1(id, user, message) VALUES('";
        queryString += secret.messageId;
        queryString += "', '";
        queryString += secret.sender;
        queryString += "', '";
        queryString += secret.body;
        queryString += "');";
        statement.execute(queryString);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}