void onPause() {
    if (mAccountManager.saveRequired()) {
        saveData();
    }
    mLastPause = java.lang.System.currentTimeMillis();
}