public void setUserLoggedIn(com.tbbr.tbbr.models.Token token) {
    this.loggedInUsersToken = token;
    if (token != null) {
        logUserIn(token);
    }
}