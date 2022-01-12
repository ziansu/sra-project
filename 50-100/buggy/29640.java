@java.lang.Override
public boolean authenticate(final java.lang.String username, final java.lang.String password) {
    org.apache.isis.core.runtime.authentication.AuthenticationRequest authenticationRequest;
    authenticationRequest = new org.apache.isis.core.runtime.authentication.AuthenticationRequestPassword(username, password);
    authenticationRequest.setRoles(java.util.Arrays.asList(org.apache.isis.viewer.wicket.viewer.integration.wicket.AuthenticatedWebSessionForIsis.USER_ROLE));
    authenticationSession = getAuthenticationManager().authenticate(authenticationRequest);
    return (authenticationSession) != null;
}