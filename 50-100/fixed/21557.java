@java.lang.Override
public com.emc.storageos.coordinator.client.model.SiteError decodeFromString(java.lang.String infoStr) throws com.emc.storageos.coordinator.exceptions.FatalCoordinatorException {
    final java.lang.String[] strings = infoStr.split(com.emc.storageos.coordinator.client.model.SiteError.ENCODING_SEPARATOR);
    com.emc.storageos.coordinator.client.model.SiteError siteError = new com.emc.storageos.coordinator.client.model.SiteError();
    siteError.creationTime = java.lang.Long.parseLong(strings[0]);
    if ((strings.length) > 1) {
        siteError.serviceCode = com.emc.storageos.svcs.errorhandling.resources.ServiceCode.valueOf(strings[1]);
        siteError.errorMessage = strings[2];
        if ((strings.length) > 2) {
            siteError.operation = strings[3];
        }
    }
    return siteError;
}