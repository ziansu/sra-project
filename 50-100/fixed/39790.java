public java.lang.String getCleanURI(com.idega.presentation.IWContext iwc) {
    java.lang.String serverUrl = null;
    java.lang.String portal = getApplicationProperty("sua.portal_address");
    if (com.idega.util.StringUtil.isEmpty(portal)) {
        serverUrl = iwc.getServerURL();
        if (serverUrl.endsWith(CoreConstants.SLASH)) {
            serverUrl = serverUrl.substring(0, ((serverUrl.length()) - 1));
        }
    }else {
        serverUrl = portal;
    }
    return serverUrl + (iwc.getRequest().getRequestURI());
}