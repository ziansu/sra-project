@java.lang.Override
public long insert() {
    java.util.List<android.content.ContentProviderOperation.Builder> mOperations = getOperationsInsert();
    try {
        android.content.ContentProviderResult[] result = executeOperations(mOperations);
        id = java.lang.Long.parseLong(result[0].uri.getLastPathSegment());
        de.aw.database.MyContentProvider.notifyCursors(tbd);
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    } catch (android.content.OperationApplicationException e) {
        e.printStackTrace();
    }
    return id;
}