@java.lang.Override
public void onStop() {
    super.onStop();
    if (mBound) {
        unbindService(mConnection);
        mBound = false;
    }
}