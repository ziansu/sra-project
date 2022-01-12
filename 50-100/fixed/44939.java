private boolean passwordMatches(java.lang.String username, java.lang.String password) {
    if (user.User.userExists(username)) {
        java.lang.String salt = ((java.lang.String) (user.User.dbUsersPasswords.get(username).get(user.User.SALT_IDX)));
        java.lang.String dbPassword = ((java.lang.String) (user.User.dbUsersPasswords.get(username).get(user.User.PW_IDX)));
        java.lang.String hashPassword = user.User.hexToString(user.User.generateHashValue(salt, password));
        return hashPassword.equals(dbPassword);
    }
    return false;
}