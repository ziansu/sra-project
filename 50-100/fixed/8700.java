@controllers.Security.Authenticated(value = controllers.Secured.class)
public static controllers.Result admin() {
    java.lang.String name = Player.find.byId(request().username()).name;
    if (!(name.equals("admin"))) {
        return redirect(routes.Application.login());
    }else {
        return ok(views.html.pages.admin.render(Player.find.all(), Player.find.byId(request().username())));
    }
}