public www.purple.mixxy.models.User getUser(java.lang.String username) {
    www.purple.mixxy.models.User user = null;
    if (username != null) {
        user = objectify.get().load().type(www.purple.mixxy.models.User.class).filter(User.USERNAME, username).first().now();
    }
    return user;
}