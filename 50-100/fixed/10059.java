@javax.annotation.Nonnull
protected javax.ws.rs.core.UriBuilder getBaseUriBuilder() {
    if ((m_bUseStaticServerInfo) && (com.helger.web.servlet.server.StaticServerInfo.isSet())) {
        return javax.ws.rs.core.UriBuilder.fromUri((((com.helger.web.servlet.server.StaticServerInfo.getInstance().getFullServerPath()) + "/") + (m_aUriInfo.getPath(false))));
    }
    return m_aUriInfo.getBaseUriBuilder();
}