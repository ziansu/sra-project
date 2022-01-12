@javax.ws.rs.POST
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
public java.lang.String createConnection(@javax.ws.rs.QueryParam(value = "token")
java.lang.String authToken, @javax.ws.rs.PathParam(value = "dataSource")
java.lang.String authProviderIdentifier, org.glyptodon.guacamole.net.basic.rest.connection.APIConnection connection) throws org.glyptodon.guacamole.GuacamoleException {
    org.glyptodon.guacamole.net.basic.GuacamoleSession session = authenticationService.getGuacamoleSession(authToken);
    org.glyptodon.guacamole.net.auth.UserContext userContext = retrievalService.retrieveUserContext(session, authProviderIdentifier);
    if (connection == null)
        throw new org.glyptodon.guacamole.GuacamoleClientException("Connection JSON must be submitted when creating connections.");
    
    org.glyptodon.guacamole.net.auth.Directory<org.glyptodon.guacamole.net.auth.Connection> connectionDirectory = userContext.getConnectionDirectory();
    connectionDirectory.add(new org.glyptodon.guacamole.net.basic.rest.connection.APIConnectionWrapper(connection));
    return connection.getIdentifier();
}