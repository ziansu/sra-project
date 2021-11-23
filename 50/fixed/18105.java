void onPause(android.content.Context context) {
    if (mAccountManager.saveRequired()) {
        saveData(context);
    }
    mLastPause = java.lang.System.currentTimeMillis();
}