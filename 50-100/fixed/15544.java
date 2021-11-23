public static models.User authenticate(java.lang.String username, java.lang.String password) {
    models.User user = models.User.find.where().eq("username", username).findUnique();
    if (user == null) {
        return null;
    }
    final boolean matched = org.mindrot.jbcrypt.BCrypt.checkpw(password, user.password);
    if (matched) {
        return user;
    }
    return null;
}