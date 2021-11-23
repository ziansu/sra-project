@java.lang.Override
public com.emc.storageos.xtremio.restapi.model.response.XtremIOResponse refreshSnapshotFromCG(java.lang.String clusterName, java.lang.String cgName, java.lang.String snapshotName) throws java.lang.Exception {
    com.emc.storageos.xtremio.restapi.model.request.XtremIOSnapCreateAndReassign refreshParam = new com.emc.storageos.xtremio.restapi.model.request.XtremIOSnapCreateAndReassign();
    refreshParam.setClusterId(clusterName);
    refreshParam.setNoBackup(java.lang.Boolean.TRUE.toString());
    refreshParam.setFromConsistencyGroupId(cgName);
    refreshParam.setToSnapshotSetId(snapshotName);
    com.emc.storageos.xtremio.restapi.XtremIOV2Client.log.info("Calling refresh snapshot with: {}", refreshParam.toString());
    com.sun.jersey.api.client.ClientResponse response = post(XtremIOConstants.XTREMIO_V2_SNAPS_URI, getJsonForEntity(refreshParam));
    return getResponseObject(com.emc.storageos.xtremio.restapi.model.response.XtremIOResponse.class, response);
}