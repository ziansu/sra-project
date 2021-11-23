public void newSession(java.lang.String username, ninja.Context context) {
    www.purple.mixxy.models.User user = userDao.getUser(username);
    if (user == null) {
        context.getFlashScope().error("Invalid user.");
        loginError(context);
    }
    context.getSession().put("username", user.username);
    context.getSession().put("userNickname", user.firstname);
    context.getSession().put("userAvatar", user.pictureUrl);
    context.getFlashScope().success("login.loginSuccessful");
}