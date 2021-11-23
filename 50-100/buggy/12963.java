private java.lang.String getIGNameForInitiator(com.emc.storageos.db.client.model.Initiator initiator, com.emc.storageos.xtremio.restapi.XtremIOClient client, java.lang.String xioClusterName) throws java.lang.Exception {
    java.lang.String igName = null;
    try {
        if (null != (initiator.getLabel())) {
            com.emc.storageos.xtremio.restapi.model.response.XtremIOInitiator initiatorObj = client.getInitiator(initiator.getLabel(), null);
            if (null != initiatorObj) {
                igName = initiatorObj.getInitiatorGroup().get(1);
            }
        }
    } catch (java.lang.Exception e) {
        com.emc.storageos.volumecontroller.impl.xtremio.XtremIOExportOperations._log.warn("Initiator {} already deleted", initiator.getLabel());
    }
    return igName;
}