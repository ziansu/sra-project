private static <T extends com.sciaps.common.objtracker.DBObj> void deleteAll(java.lang.Class<T> type, com.sciaps.common.webserver.LIBZHttpClient.BasicObjectClient<T> client, com.sciaps.common.objtracker.DBObjTracker tracker) throws java.io.IOException {
    java.util.Iterator<com.sciaps.common.swing.libzunitapi.T> it = tracker.getDeletedObjectsOfType(type);
    while (it.hasNext()) {
        com.sciaps.common.swing.libzunitapi.T obj = it.next();
        client.deleteObject(obj.mId);
        tracker.removeDelete(obj);
    } 
}