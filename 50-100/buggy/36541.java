public java.util.List<models.User> getAllUsers() {
    try {
        java.sql.PreparedStatement statement = this.connection.prepareStatement("SELECT id, name FROM users");
        java.sql.ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        java.util.ArrayList<models.User> list = new java.util.ArrayList<>();
        while (resultSet.next()) {
            list.add(this.buildUserFromRow(resultSet));
        } 
        statement.close();
        return list;
    } catch (java.sql.SQLException ignored) {
        return null;
    }
}