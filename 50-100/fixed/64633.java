public static controllers.Result systemConfig() {
    controllers.User _user = controllers.User.findByUserId(java.lang.Long.parseLong(session("userId")));
    play.Logger.info((("[" + (_user.username)) + "] user admin page."));
    java.util.List<controllers.Settings> webconfig = controllers.Settings.findAll();
    return ok(admin_systemconfig.render(_user, webconfig));
}