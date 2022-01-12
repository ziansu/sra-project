public synchronized java.util.Set<java.lang.Long> addTag(long objID, java.lang.Long artifactID, org.sleuthkit.datamodel.Tag tag) {
    java.util.Set<java.lang.Long> updatedEventIDs = eventDB.addTag(objID, artifactID, tag);
    if (!(updatedEventIDs.isEmpty())) {
        invalidateCaches(updatedEventIDs);
    }
    return updatedEventIDs;
}