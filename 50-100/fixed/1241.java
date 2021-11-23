public boolean isCatalogServer(final java.net.URL url) {
    if (null == (com.emc.storageos.systemservices.impl.upgrade.beans.SoftwareUpdate._catalogServerHostNames)) {
        throw APIException.internalServerErrors.targetIsNullOrEmpty("catalog server host names");
    }
    for (java.lang.String catalogServerHostName : com.emc.storageos.systemservices.impl.upgrade.beans.SoftwareUpdate._catalogServerHostNames) {
        if (catalogServerHostName.equalsIgnoreCase(url.getHost())) {
            return true;
        }
    }
    return false;
}