public static controllers.Result login() {
    session().clear();
    java.sql.Connection connection = controllers.DB.getConnection();
    return ok(login.render());
}