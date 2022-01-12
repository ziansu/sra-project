private void doDeletePolicyReferenceFromDB(com.emc.storageos.db.client.model.FileShare fs) {
    com.emc.storageos.volumecontroller.impl.FileDeviceController._log.info(("Removing policy reference for file system  " + (fs.getName())));
    for (java.lang.String policy : fs.getFilePolicies()) {
        com.emc.storageos.db.client.model.SchedulePolicy fp = _dbClient.queryObject(com.emc.storageos.db.client.model.SchedulePolicy.class, java.net.URI.create(policy));
        com.emc.storageos.db.client.model.StringSet fsURIs = fp.getAssignedResources();
        fsURIs.remove(fs.getId());
        fp.setAssignedResources(fsURIs);
        _dbClient.updateObject(fp);
    }
}