@javax.annotation.Nonnull
public java.net.URI getCurrentURI() {
    if ((m_bUseStaticServerInfo) && (com.helger.web.servlet.server.StaticServerInfo.isSet()))
        return com.helger.commons.url.URLHelper.getAsURI((((com.helger.web.servlet.server.StaticServerInfo.getInstance().getFullServerPath()) + "/") + (m_aUriInfo.getPath())));
    
    if (false) {
        m_aUriInfo.getBaseUri();
        m_aUriInfo.getPath();
        m_aUriInfo.getAbsolutePath();
    }
    return m_aUriInfo.getAbsolutePath();
}