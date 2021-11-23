@java.lang.Override
public void onServiceDisconnected(final android.content.ComponentName name) {
    mService = null;
    mBounded = false;
    android.util.Log.d(diplom.jodoapp.LoginActivity.TAG, "onServiceDisconnected");
}