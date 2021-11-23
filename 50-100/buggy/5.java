public java.sql.Connection connect() {
    try {
        if (connection.isValid(7)) {
            return connection;
        }else {
            connection = java.sql.DriverManager.getConnection(getUrl(), _username, _password);
            return connection;
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return null;
    }
}