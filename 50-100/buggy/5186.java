public static controllers.Result signin() throws java.io.IOException {
    if (controllers.Register.allusers.updating) {
        return redirect(controllers.routes.Register.updating());
    }
    controllers.Form<models.User> filledForm = controllers.Register.userForm.bindFromRequest();
    models.User created = filledForm.get();
    if (!(controllers.Register.allusers.loginCheck(created.username, created.password))) {
        return ok(home.render(controllers.Register.userForm, "true"));
    }
    controllers.Register.r.setHeader("curr", created.username);
    return redirect(controllers.routes.Register.user(created.username));
}