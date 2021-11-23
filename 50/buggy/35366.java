public static controllers.Result impressum() {
    try {
        controllers.Application.connection.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return ok(impressum.render());
}