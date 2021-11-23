@java.lang.Override
public void run() {
    try {
        for (com.facebook.internal.NativeProtocol.NativeAppInfo appInfo : com.facebook.internal.NativeProtocol.facebookAppInfoList) {
            appInfo.fetchAvailableVersions(true);
        }
    } finally {
        com.facebook.internal.NativeProtocol.protocolVersionsAsyncUpdating.set(false);
    }
}