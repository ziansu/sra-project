private java.util.Set<java.lang.String> getExistingInstanceIds(java.lang.String instanceTag, java.util.Set<org.json.JSONObject> existingInstances) {
    java.util.Set<java.lang.String> instancesIds = com.google.common.collect.Sets.newHashSet();
    for (org.json.JSONObject instance : existingInstances) {
        if (instance.getString("tag").equals(instanceTag)) {
            instancesIds.add(instance.getString("id"));
        }
    }
    return instancesIds;
}