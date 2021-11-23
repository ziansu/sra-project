public org.traccar.model.User login(java.lang.String email, java.lang.String password) throws java.sql.SQLException {
    org.traccar.model.User user = org.traccar.database.QueryBuilder.create(dataSource, getQuery("database.loginUser")).setString("email", email).executeQuerySingle(new org.traccar.model.User());
    return (user != null) && (user.isPasswordValid(password)) ? user : null;
}