public static user.GoogleUser getCurrentUser() {
    com.google.appengine.api.users.UserService userService = com.google.appengine.api.users.UserServiceFactory.getUserService();
    if ((userService.getCurrentUser()) == null) {
        return null;
    }
    return new user.GoogleUser(userService.getCurrentUser());
}