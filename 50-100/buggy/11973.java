@android.support.annotation.MainThread
private void clearDataSource(final boolean clearTargetState) {
    synchronized(mLock) {
        logger.debug(("clearDataSource(), clearTargetState=" + clearTargetState));
        cancelResetCallback();
        mScriptExecutor.execute("clearDataSource()");
        mScriptExecutor.execute("clearImage()");
        mScriptExecutor.execute("clearPage()");
        mLastContentUriToOpen = null;
        mLastAssetFileDescriptorToOpen = null;
        mLastModeToOpen = PlayMode.NONE;
        setCurrentState(State.IDLE);
        if (clearTargetState) {
            setTargetState(State.IDLE);
        }
    }
}