private void buildLoginPageContent() {
    if ((this.user) == null) {
        return ;
    }
    java.lang.String email = this.user.getEmail();
    contentMap.put("email", email);
    java.lang.String password = user.getPassword();
    contentMap.put("password", password);
    if (isAuthError) {
        contentMap.put("login_err_authenticate", eu.europeana.metis.page.MetisLandingPage.ERROR_AUTH);
    }
}