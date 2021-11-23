public boolean isLoggedIn() {
    if (expirationDate.before(new java.util.Date())) {
        loggedIn = false;
    }
    return loggedIn;
}