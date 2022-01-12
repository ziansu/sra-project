@java.lang.Override
public void onResume() {
    super.onResume();
    android.content.IntentFilter filter = new android.content.IntentFilter(com.teocci.ytinbg.utils.Config.INTENT_SESSION_TOKEN);
    registerReceiver(mMessageReceiver, filter);
    if ((sessionToken) != null) {
        com.teocci.ytinbg.utils.LogHelper.e(com.teocci.ytinbg.ui.MainActivity.TAG, "on sessionToken receive");
        try {
            connectToSession(sessionToken);
            if ((lastTransaction) != null)
                lastTransaction.commit();
            
        } catch (android.os.RemoteException re) {
            com.teocci.ytinbg.utils.LogHelper.e(com.teocci.ytinbg.ui.MainActivity.TAG, re, "could not connect media controller");
            hidePlaybackControls();
        }
    }
}