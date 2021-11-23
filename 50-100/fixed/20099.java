private void initIdentity() {
    android.content.Intent intent = getIntent();
    mUUID = intent.getStringExtra(Constant.JSON_KEY_UUID);
    if ((mUUID) != null) {
        mPSW = intent.getStringExtra(Constant.JSON_KEY_PSW);
    }else {
        android.content.SharedPreferences preferences = getSharedPreferences(Constant.PREFS_FILE, sg.nus.tangting.PiWatcher.Activity.MODE_PRIVATE);
        mUUID = preferences.getString(Constant.PREFS_KEY_UUID, "");
        mPSW = preferences.getString(Constant.PREFS_KEY_PSW, "");
    }
    mJPushAlias = mUUID.replace("-", "");
}