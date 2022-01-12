@java.lang.Override
public tigase.xml.Element[] supStreamFeatures(tigase.xmpp.impl.XMPPResourceConnection session) {
    if ((session == null) || (!(session.isAuthorized())))
        return null;
    
    return super.supStreamFeatures(session);
}