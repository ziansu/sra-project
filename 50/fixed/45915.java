@org.opendatakit.common.android.views.JavascriptInterface
public void saveCheckpointAsIncomplete(java.lang.String tableId, java.lang.String rowId, java.lang.String callbackJSON, java.lang.String transId, java.lang.Boolean leaveTransactionOpen) throws android.os.RemoteException {
    weakData.get().saveCheckpointAsIncomplete(tableId, rowId, callbackJSON, transId, leaveTransactionOpen);
}