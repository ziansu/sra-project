@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    if (mIsServiceBound) {
        mService.stopFileRead(true);
    }
    cleanUpOnExit();
}