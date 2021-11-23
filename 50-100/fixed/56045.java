public static controllers.Result project() {
    controllers.User _user = controllers.User.findByUserId(java.lang.Long.parseLong(session("userId")));
    play.Logger.info((("[" + (_user.username)) + "] user admin page."));
    java.util.List<controllers.User> users = controllers.User.findAll();
    java.util.List<controllers.Project> projects = controllers.Project.findAll();
    return ok(admin_project.render(_user, users, projects));
}