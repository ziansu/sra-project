public boolean loginAsUser(java.lang.String username, java.lang.String password) {
    capstat.model.User user = this.userLedger.getUserByNickname(username);
    java.lang.String hashedPassword = capstat.model.Security.hashPassword(password);
    if (hashedPassword.equals(user.getHashedPassword())) {
        this.capStat.setLoggedInUser(user);
        return true;
    }
    return false;
}