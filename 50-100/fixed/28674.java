public static play.mvc.Result index() {
    controllers.Application.name = session("name");
    if ((controllers.Application.name) == null) {
        return ok(index.render(controllers.Coupon.all(), controllers.Category.all()));
    }
    models.User currentUser = models.User.find(controllers.Application.name);
    return ok(index.render(controllers.Coupon.all(), controllers.Category.all()));
}