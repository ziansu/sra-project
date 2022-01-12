@java.lang.Override
protected void onPause() {
    com.owncloud.android.lib.common.utils.Log_OC.d(com.owncloud.android.ui.activity.FileDisplayActivity.TAG, "onPause() start");
    if ((mSyncBroadcastReceiver) != null) {
        unregisterReceiver(mSyncBroadcastReceiver);
        mSyncBroadcastReceiver = null;
    }
    if ((mUploadFinishReceiver) != null) {
        unregisterReceiver(mUploadFinishReceiver);
        mUploadFinishReceiver = null;
    }
    if ((mDownloadFinishReceiver) != null) {
        unregisterReceiver(mDownloadFinishReceiver);
        mDownloadFinishReceiver = null;
    }
    super.onPause();
    com.owncloud.android.lib.common.utils.Log_OC.d(com.owncloud.android.ui.activity.FileDisplayActivity.TAG, "onPause() end");
}