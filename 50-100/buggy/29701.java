public boolean isUserValid(java.lang.String username) {
    if (username != null) {
        www.purple.mixxy.models.User user = objectify.get().load().type(www.purple.mixxy.models.User.class).filter(User.USERNAME, username).first().now();
        if (user != null) {
            return true;
        }
    }
    return false;
}