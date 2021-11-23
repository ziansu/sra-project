public java.util.Set<java.lang.String> createInstancesIfNotExisist(java.lang.String infrastructureId, java.lang.String instanceTag, java.lang.String instanceJson, java.util.Set<org.json.JSONObject> existingInstances) {
    java.util.Set<java.lang.String> instancesIds = getExistingInstanceIds(instanceTag, existingInstances);
    if (instancesIds.isEmpty()) {
        instancesIds = createInstances(infrastructureId, instanceJson);
    }
    return instancesIds;
}