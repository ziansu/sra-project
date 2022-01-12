@javax.ws.rs.POST
public org.glyptodon.guacamole.net.basic.rest.user.APIUser createUser(@javax.ws.rs.QueryParam(value = "token")
java.lang.String authToken, @javax.ws.rs.PathParam(value = "dataSource")
java.lang.String authProviderIdentifier, org.glyptodon.guacamole.net.basic.rest.user.APIUser user) throws org.glyptodon.guacamole.GuacamoleException {
    org.glyptodon.guacamole.net.basic.GuacamoleSession session = authenticationService.getGuacamoleSession(authToken);
    org.glyptodon.guacamole.net.auth.UserContext userContext = retrievalService.retrieveUserContext(session, authProviderIdentifier);
    org.glyptodon.guacamole.net.auth.Directory<org.glyptodon.guacamole.net.auth.User> userDirectory = userContext.getUserDirectory();
    if ((user.getPassword()) == null)
        user.setPassword(java.util.UUID.randomUUID().toString());
    
    userDirectory.add(new org.glyptodon.guacamole.net.basic.rest.user.APIUserWrapper(user));
    return user;
}