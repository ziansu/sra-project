public java.lang.Boolean setVolumeRestricted(java.lang.String volName) throws com.emc.storageos.netapp.NetAppException {
    try {
        com.emc.storageos.netapp.NetAppApi.netAppFacade = new com.iwave.ext.netapp.NetAppFacade(_ipAddress, _portNumber, _userName, _password, _https);
        com.emc.storageos.netapp.NetAppApi.netAppFacade.setVolumeRestricted(volName, 1);
        return true;
    } catch (java.lang.Exception e) {
        throw NetAppException.exceptions.setVolumeRestrictFailed(volName, _ipAddress, e.getMessage());
    }
}