public void onSuccess(org.matrix.androidsdk.crypto.data.MXUsersDevicesMap<org.matrix.androidsdk.crypto.data.MXDeviceInfo> usersDevicesInfoMap) {
    org.matrix.androidsdk.util.Log.d(org.matrix.androidsdk.crypto.MXCrypto.LOG_TAG, (("## downloadKeys() : doKeyDownloadForUsers succeeds after " + ((java.lang.System.currentTimeMillis()) - t0)) + " ms"));
    usersDevicesInfoMap.addEntriesFromMap(stored);
    if (null != callback) {
        callback.onSuccess(usersDevicesInfoMap);
    }
}