@controllers.Security.Authenticated(value = controllers.Secured.class)
public static controllers.Result admin() {
    return ok(admin.render(controllers.Application.postDao.findAll(true)));
}