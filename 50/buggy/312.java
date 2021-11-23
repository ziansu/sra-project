public void setUserLoggedIn(com.tbbr.tbbr.models.Token token) {
    com.tbbr.tbbr.models.Token oldVal = loggedInUsersToken;
    this.loggedInUsersToken = token;
    if (token != null) {
        logUserIn(token);
    }
}