public void addUser(org.traccar.model.User user) throws java.sql.SQLException {
    user.setId(org.traccar.database.QueryBuilder.create(dataSource, getQuery("database.insertUser")).setObject(user).executeUpdate());
    org.traccar.Context.getPermissionsManager().refresh();
}