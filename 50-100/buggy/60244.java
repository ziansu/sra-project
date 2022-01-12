protected boolean isDataObjectRemoved(java.lang.Class<? extends com.emc.storageos.db.client.model.DataObject> clazz, java.lang.String key) {
    java.util.List<? extends com.emc.storageos.db.client.model.DataObject> dataObjects = dbClient.queryObjectField(clazz, "inactive", com.google.common.collect.Lists.newArrayList(java.net.URI.create(key)));
    return ((dataObjects == null) || ((dataObjects.size()) == 0)) || (dataObjects.get(0).getInactive());
}