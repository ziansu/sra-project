public void doLogin(java.lang.String username, java.lang.String password, java.lang.Boolean rememberMe) {
    org.bbop.apollo.gwt.client.rest.UserRestService.login(username, password, rememberMe);
}