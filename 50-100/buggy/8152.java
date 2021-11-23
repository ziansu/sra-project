public static models.Account authenticate(java.lang.String email, java.lang.String password) {
    models.Account account = models.Account.find.where().eq("email", email).findUnique();
    if (org.mindrot.jbcrypt.BCrypt.checkpw(password, account.password)) {
        return account;
    }
    return null;
}