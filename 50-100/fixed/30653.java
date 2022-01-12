public boolean isActiveSession(java.lang.String applicationTokenXML) {
    try {
        net.whydah.sso.application.types.ApplicationToken at = net.whydah.sso.application.mappers.ApplicationTokenMapper.fromXml(applicationTokenXML);
        if ((at.getApplicationID().length()) > 8) {
            return true;
        }
    } catch (java.lang.Exception e) {
    }
    return false;
}