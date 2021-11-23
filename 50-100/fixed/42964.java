@java.lang.Override
public long insert() {
    try {
        android.content.ContentProviderResult[] result = executeOperations(getOperationsInsert());
        id = java.lang.Long.parseLong(result[0].uri.getLastPathSegment());
        de.aw.database.MyContentProvider.notifyCursors(tbd);
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    } catch (android.content.OperationApplicationException e) {
        e.printStackTrace();
    }
    return id;
}