public static controllers.Result logout() {
    session().clear();
    flash("success", "You've been logged out");
    java.lang.String username = User.find.byId(java.lang.Integer.parseInt(session().get("userID"))).username;
    controllers.Logger.info(((("username: " + username) + " has logged out at ") + (java.time.LocalDateTime.now())));
    return redirect(routes.Login.login());
}