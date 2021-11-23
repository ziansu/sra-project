public void onSuccess(org.matrix.androidsdk.crypto.MXCrypto.DoKeyDownloadForUsersResponse response) {
    org.matrix.androidsdk.util.Log.d(org.matrix.androidsdk.crypto.MXCrypto.LOG_TAG, (("## downloadKeys() : doKeyDownloadForUsers succeeds after " + ((java.lang.System.currentTimeMillis()) - t0)) + " ms"));
    org.matrix.androidsdk.crypto.data.MXUsersDevicesMap<org.matrix.androidsdk.crypto.data.MXDeviceInfo> usersDevicesInfoMap = response.mUsersDevicesInfoMap;
    java.util.List<java.lang.String> failedUserIds = response.mFailedUserIds;
    for (java.lang.String failedUserId : failedUserIds) {
        org.matrix.androidsdk.util.Log.e(org.matrix.androidsdk.crypto.MXCrypto.LOG_TAG, ("## downloadKeys() : Error downloading keys for user " + failedUserId));
    }
    usersDevicesInfoMap.addEntriesFromMap(stored);
    if (null != callback) {
        callback.onSuccess(usersDevicesInfoMap);
    }
}