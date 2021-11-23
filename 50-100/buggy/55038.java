public synchronized void checkCurrentOperationAndExecuteNextIfSuccessful() {
    if (((mCurrentOperation) != null) && ((isTargetState(mCurrentOperation)) == null)) {
        android.util.Log.d(io.jxcore.node.StartStopOperationQueue.TAG, "checkCurrentOperationAndExecuteNextIfSuccessful: Operation successfully executed");
        if ((mOperationTimeoutTimer) != null) {
            mOperationTimeoutTimer.cancel();
            mCurrentOperation = null;
        }
        mCurrentOperation.getCallback().callOnStartStopCallback(null);
        mCurrentOperation = null;
        executeNextOperation();
    }
}