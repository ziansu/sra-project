private <P extends com.einzig.ipst2.portal.PortalSubmission> P getPortal(java.lang.String table, java.lang.String pictureURL, java.lang.String portalName, com.einzig.ipst2.database.PortalBuilder<P> builder) {
    java.util.Vector<P> portals = getAll(table, ((com.einzig.ipst2.database.DatabaseInterface.KEY_PICTURE_URL) + " = ?"), new java.lang.String[]{ pictureURL }, builder);
    for (P portal : portals) {
        if (portal.getName().equals(portalName))
            return portal;
        else
            return portal;
        
    }
    return null;
}