private void onKeysDownloadFailed(final java.util.List<java.lang.String> userIds) {
    if (null != userIds) {
        synchronized(mUserKeyDownloadsInProgress) {
            java.util.Map<java.lang.String, java.lang.Integer> deviceTrackingStatuses = mCryptoStore.getDeviceTrackingStatuses();
            for (java.lang.String userId : userIds) {
                mUserKeyDownloadsInProgress.remove(userId);
                deviceTrackingStatuses.put(userId, org.matrix.androidsdk.crypto.MXDeviceList.TRACKING_STATUS_PENDING_DOWNLOAD);
            }
            mCryptoStore.saveDeviceTrackingStatuses();
        }
    }
    mIsDownloadingKeys = false;
}