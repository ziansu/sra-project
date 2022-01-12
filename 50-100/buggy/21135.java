@java.lang.Override
public void handleMessage(android.os.Message msg) {
    java.lang.String _msg = ((java.lang.String) (msg.obj));
    android.util.Log.d(com.jsbd.uart.server.LogService.TAG, _msg);
    if ((mCallback) != null) {
        mCallback.onMessage(_msg);
    }
    try {
        mOut.write(_msg.getBytes());
        mOut.flush();
    } catch (java.io.IOException e) {
        android.util.Log.e(com.jsbd.uart.server.LogService.TAG, android.util.Log.getStackTraceString(e));
    }
}