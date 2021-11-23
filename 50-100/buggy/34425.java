@java.lang.Override
public int delete() {
    java.lang.Integer deleted = 0;
    try {
        android.content.ContentProviderResult[] res = executeOperations(getOperationsDelete());
        for (android.content.ContentProviderResult result : res) {
            deleted += result.count;
        }
        setSaldoAccount();
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    } catch (android.content.OperationApplicationException e) {
        e.printStackTrace();
    }
    return deleted;
}