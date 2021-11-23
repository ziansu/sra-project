@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    setState("stop");
    android.util.Log.d(Constants.DEBUG_TAG, "NotificationService : onUnbind");
    return super.onUnbind(intent);
}