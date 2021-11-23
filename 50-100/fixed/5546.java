private void processSLOBasedAutoTierPolicies(com.emc.storageos.db.client.model.StorageSystem storageSystem, java.util.Set<java.lang.String> sloNames, java.util.List<com.emc.storageos.db.client.model.AutoTieringPolicy> newList, java.util.List<com.emc.storageos.db.client.model.AutoTieringPolicy> updateList) throws java.io.IOException {
    if (newList != null) {
        _dbClient.createObject(newList);
    }
    if (updateList != null) {
        _dbClient.updateAndReindexObject(updateList);
    }
}