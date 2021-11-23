public java.util.Collection<eu.seaclouds.platform.dashboard.model.SeaCloudsApplicationData> listSeaCloudsApplicationData() {
    java.util.concurrent.ConcurrentNavigableMap<java.lang.String, eu.seaclouds.platform.dashboard.model.SeaCloudsApplicationData> treeMap = eu.seaclouds.platform.dashboard.model.SeaCloudsObjectStorage.dataStore.getTreeMap(eu.seaclouds.platform.dashboard.model.SeaCloudsObjectStorage.SEACLOUDS_APPLICATION_DATA_COLLECTION_TAG);
    java.util.Collection<eu.seaclouds.platform.dashboard.model.SeaCloudsApplicationData> seaCloudsApplicationDataCollection = treeMap.values();
    eu.seaclouds.platform.dashboard.model.SeaCloudsObjectStorage.dataStore.close();
    return seaCloudsApplicationDataCollection;
}