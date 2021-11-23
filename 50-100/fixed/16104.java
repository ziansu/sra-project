@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.e("onStartCommand", "onStartCommand");
    boolean checkStatus = true;
    if (intent != null) {
        checkStatus = intent.getBooleanExtra("CheckStatus", true);
    }
    com.ufo.socketioservice.SocketIOManager.getInstance().connect(getApplicationContext(), checkStatus);
    return super.onStartCommand(intent, flags, startId);
}