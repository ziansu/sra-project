com.emc.storageos.isilon.restapi.IsilonSyncPolicy doEnableReplicationPolicy(com.emc.storageos.isilon.restapi.IsilonApi isi, java.lang.String policyName) {
    com.emc.storageos.isilon.restapi.IsilonSyncPolicy modifiedPolicy = new com.emc.storageos.isilon.restapi.IsilonSyncPolicy();
    modifiedPolicy.setName(policyName);
    modifiedPolicy.setEnabled(true);
    com.emc.storageos.isilon.restapi.IsilonSyncPolicy policy = isi.getReplicationPolicy(policyName);
    if ((null != policy) && (!(policy.getEnabled()))) {
        isi.modifyReplicationPolicy(policyName, modifiedPolicy);
        policy = isi.getReplicationPolicy(policyName);
    }
    com.emc.storageos.volumecontroller.impl.isilon.IsilonMirrorOperations._log.info("Replication Policy -{}  enabled successfully.", policy.toString());
    return policy;
}