public void newSession(www.purple.mixxy.models.User user, ninja.Context context) {
    context.getSession().put("username", user.username);
    context.getSession().put("userNickname", user.firstname);
    context.getSession().put("userAvatar", user.pictureUrl);
    context.getFlashScope().success("login.loginSuccessful");
}