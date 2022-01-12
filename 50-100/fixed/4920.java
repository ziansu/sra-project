@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    if (mBound) {
        unbindService(mConnection);
        mBound = false;
    }
    final java.lang.String PERSIST_SERVICE = mContext.getString(R.string.pref_persistservice_key);
    boolean persistService = prefs.getBoolean(PERSIST_SERVICE, false);
    if (!persistService) {
        android.content.Intent intent = new android.content.Intent(mContext, com.SecUpwN.AIMSICD.service.AimsicdService.class);
        stopService(intent);
    }
}