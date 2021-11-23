@java.lang.Override
public void onStop() {
    super.onStop();
    if (isServiceBound) {
        mBinder.removeCallback(mCallback);
        unbindService(mConnection);
        isServiceBound = false;
    }
}