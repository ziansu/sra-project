boolean stopNetworkLogging() {
    android.util.Log.d(com.android.server.devicepolicy.NetworkLogger.TAG, "Stopping network logging");
    mIsLoggingEnabled.set(false);
    try {
        if (!(checkIpConnectivityMetricsService())) {
            android.util.Slog.wtf(com.android.server.devicepolicy.NetworkLogger.TAG, "Failed to unregister callback with IIpConnectivityMetrics.");
            return true;
        }
        return mIpConnectivityMetrics.unregisterNetdEventCallback();
    } catch (android.os.RemoteException re) {
        android.util.Slog.wtf(com.android.server.devicepolicy.NetworkLogger.TAG, "Failed to make remote calls to unregister the callback", re);
    } finally {
        mHandlerThread.quitSafely();
        return true;
    }
}