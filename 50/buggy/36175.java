protected void toggleDebugLog() {
    mDebugLog = !(mDebugLog);
    if ((gameHelper) != null) {
        mHelper.enableDebugLog(mDebugLog);
    }
}