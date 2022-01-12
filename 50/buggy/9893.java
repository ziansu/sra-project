public ninja.Result listUsers(@ai.subut.kurjun.web.security.AuthorizedUser
ai.subut.kurjun.model.identity.UserSession userSession) {
    java.util.List<ai.subut.kurjun.model.identity.User> users = identityManagerService.getAllUsers();
    return ninja.Results.html().template("views/users.ftl").render("users", users);
}