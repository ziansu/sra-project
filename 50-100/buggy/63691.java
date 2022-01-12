@java.lang.Override
public void onDestroy() {
    if (((mWakeLock) != null) && (mWakeLock.isHeld())) {
        mWakeLock.release();
        android.util.Log.d(com.android.camera.CameraActivity.TAG, "wake lock release");
    }
    getContentResolver().unregisterContentObserver(mLocalImagesObserver);
    getContentResolver().unregisterContentObserver(mLocalVideosObserver);
    unregisterReceiver(mSDcardMountedReceiver);
    mCursor.close();
    mCursor = null;
    super.onDestroy();
}