@play.db.jpa.Transactional
public static controllers.Result index() {
    models.Admin admin = controllers.SGDB.getAdmin(session().get("login"));
    if (admin != null) {
        ok(index.render(admin));
    }
    return controllers.Application.home();
}