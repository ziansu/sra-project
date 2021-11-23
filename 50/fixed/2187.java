public boolean isLoggedIn() {
    if ((expirationDate) == null) {
        return false;
    }
    if (expirationDate.before(new java.util.Date())) {
        loggedIn = false;
    }
    return loggedIn;
}