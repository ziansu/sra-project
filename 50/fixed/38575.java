@java.lang.Override
public void onServiceDisconnected(final android.content.ComponentName name) {
    mService = null;
    mBounded = false;
}