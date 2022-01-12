private void heartbeat() {
    android.util.Log.d(com.oinux.ghost.Ghost.TAG, "heartbeat");
    mId = com.oinux.android.ConfigLoader.getInstance().getString(Config.T_KEY, null);
    if (android.text.TextUtils.isEmpty(mId))
        return ;
    
    connect();
}