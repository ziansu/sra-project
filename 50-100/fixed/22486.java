private static void internalFetchAdvertisingInfoAsync(final android.content.Context context, final com.mopub.common.GpsHelper.GpsHelperListener gpsHelperListener) {
    if (!(com.mopub.common.util.Reflection.classFound(com.mopub.common.GpsHelper.sAdvertisingIdClientClassName))) {
        if (gpsHelperListener != null) {
            gpsHelperListener.onFetchAdInfoCompleted();
        }
        return ;
    }
    try {
        new com.mopub.common.GpsHelper.FetchAdvertisingInfoTask(context, gpsHelperListener).execute(null, null, null);
    } catch (java.lang.Exception exception) {
        com.mopub.common.logging.MoPubLog.d("Error executing FetchAdvertisingInfoTask", exception);
        if (gpsHelperListener != null) {
            gpsHelperListener.onFetchAdInfoCompleted();
        }
    }
}