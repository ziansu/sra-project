@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    android.util.Log.d(org.ShinRH.android.mocklocation.MapActivity.TAG, "onServiceConnected ");
    mMockLocationService = new android.os.Messenger(service);
    mIsBound = true;
    sendMessageToService(MockLocationService.MSG_GET_STATUS, null);
}