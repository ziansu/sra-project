@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    android.util.Log.d(fyp.qian3.lib.srv.PedoEventService.TAG, "Srv onBind()");
    return mBinder;
}