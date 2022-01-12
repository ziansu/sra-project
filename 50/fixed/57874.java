@play.db.jpa.Transactional
public static controllers.Result logout() {
    session().clear();
    return ok();
}