@java.lang.Override
public org.glyptodon.guacamole.net.auth.UserContext updateUserContext(org.glyptodon.guacamole.net.auth.UserContext context, org.glyptodon.guacamole.net.auth.Credentials credentials) throws org.glyptodon.guacamole.GuacamoleException {
    javax.servlet.http.HttpServletRequest request = credentials.getRequest();
    org.glyptodon.guacamole.protocol.GuacamoleConfiguration config = getGuacamoleConfiguration(request);
    if (config == null) {
        return null;
    }
    java.lang.String id = config.getParameter("id");
    org.glyptodon.guacamole.net.auth.simple.SimpleConnectionDirectory connections = ((org.glyptodon.guacamole.net.auth.simple.SimpleConnectionDirectory) (context.getConnectionDirectory()));
    org.glyptodon.guacamole.net.auth.simple.SimpleConnection connection = new org.glyptodon.guacamole.net.auth.simple.SimpleConnection(id, id, config);
    connections.putConnection(connection);
    return context;
}