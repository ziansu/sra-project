public synchronized void executeStartOperation(boolean startAdvertising, io.jxcore.node.JXcoreThaliCallback callback) {
    if ((mCurrentOperation) != null) {
        android.util.Log.w(io.jxcore.node.StartStopOperationHandler.TAG, "executeStartOperation: Cancelling a pending operation");
        cancelCurrentOperation();
    }
    mCurrentOperation = io.jxcore.node.StartStopOperation.createStartOperation(startAdvertising, callback);
    executeCurrentOperation();
}