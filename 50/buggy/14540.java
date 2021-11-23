public static controllers.Result logOut() {
    session().clear();
    controllers.Application.loggedIn = false;
    return redirect(routes.Application.index());
}