public synchronized java.util.HashSet<java.lang.Long> deleteTag(long objID, java.lang.Long artifactID, org.sleuthkit.datamodel.Tag tag, boolean tagged) {
    java.util.HashSet<java.lang.Long> updatedEventIDs = eventDB.deleteTag(objID, artifactID, tag, tagged);
    if (!(updatedEventIDs.isEmpty())) {
        invalidateCaches(updatedEventIDs);
    }
    return updatedEventIDs;
}