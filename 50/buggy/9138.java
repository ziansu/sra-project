@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    android.util.Log.d(TAG, "onUnbind()");
    handler.removeCallbacks(runnable);
    return super.onUnbind(intent);
}