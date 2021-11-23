@java.lang.Override
public int delete() {
    java.util.List<android.content.ContentProviderOperation.Builder> mOperations = getOperationsDelete();
    java.lang.Integer deleted = 0;
    try {
        android.content.ContentProviderResult[] res = executeOperations(mOperations);
        de.aw.database.MyContentProvider.notifyCursors(tbd);
        for (android.content.ContentProviderResult result : res) {
            deleted += result.count;
        }
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    } catch (android.content.OperationApplicationException e) {
        e.printStackTrace();
    }
    return deleted;
}