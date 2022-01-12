@java.lang.Override
public com.yagodar.essential.operation.OperationResult<java.lang.Long> insert(long groupId, android.support.v4.os.CancellationSignal signal) {
    com.yagodar.essential.operation.OperationResult<java.lang.Long> opResult;
    synchronized(this) {
        opResult = mTableManager.insertToGroup(DbTableBillOrderContract.COLUMN_NAME_BILL_ID, groupId);
    }
    if (!(opResult.isSuccessful())) {
        opResult.setFailMessageId(R.string.err_append_failed);
    }
    return opResult;
}