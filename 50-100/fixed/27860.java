private static <T extends com.sciaps.common.objtracker.DBObj> void deleteAll(java.lang.Class<T> type, com.sciaps.common.webserver.LIBZHttpClient.BasicObjectClient<T> client, com.sciaps.common.objtracker.DBObjTracker tracker) throws java.io.IOException {
    java.util.ArrayList<com.sciaps.common.swing.libzunitapi.T> list = new java.util.ArrayList<com.sciaps.common.swing.libzunitapi.T>();
    java.util.Iterator<com.sciaps.common.swing.libzunitapi.T> it = tracker.getDeletedObjectsOfType(type);
    while (it.hasNext()) {
        list.add(it.next());
    } 
    for (com.sciaps.common.swing.libzunitapi.T obj : list) {
        client.deleteObject(obj.mId);
    }
}