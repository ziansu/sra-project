private void logoutMellon(final javax.servlet.http.HttpServletRequest httpRequest, final javax.servlet.http.HttpServletResponse httpResponse, final java.lang.String username) throws java.io.IOException, javax.servlet.ServletException {
    try {
        this.authenticationManager.logout(username);
    } catch (final com.alliander.osgp.shared.usermanagement.KeycloakClientException e) {
        com.alliander.osgp.shared.security.MellonTokenProcessingFilter.LOGGER.error("Error logging user '{}' out with the Keycloak API.", username, e);
    }
    httpResponse.sendRedirect(this.logoutUrl);
}