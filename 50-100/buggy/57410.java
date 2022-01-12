@java.lang.Override
public com.yagodar.essential.operation.OperationResult<java.lang.Integer> delete(long groupId, long id, android.support.v4.os.CancellationSignal signal) {
    com.yagodar.essential.operation.OperationResult<java.lang.Integer> opResult = mTableManager.delete(id);
    if (!(opResult.isSuccessful())) {
        opResult.setFailMessageId(R.string.err_remove_failed);
    }
    return opResult;
}