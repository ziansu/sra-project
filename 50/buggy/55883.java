@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    android.util.Log.i(TAG, ("Messenger received WHAT value: " + (msg.what)));
    doWork(msg);
}