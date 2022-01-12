public void clearAll() {
    Settings.Global.putString(mContentResolver, DemoMode.DEMO_MODE_ALLOWED, null);
    android.content.Intent intent = new android.content.Intent(com.android.systemui.DemoMode.ACTION_DEMO);
    intent.putExtra(DemoMode.EXTRA_COMMAND, DemoMode.COMMAND_EXIT);
    mContext.sendBroadcast(intent);
    for (java.lang.String key : mTunableLookup.keySet()) {
        Settings.Secure.putString(mContentResolver, key, null);
    }
}