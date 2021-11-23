public long getPackageTxBytesMobile(android.content.Context context) {
    android.app.usage.NetworkStats networkStats = null;
    try {
        networkStats = networkStatsManager.queryDetailsForUid(ConnectivityManager.TYPE_MOBILE, getSubscriberId(context, ConnectivityManager.TYPE_MOBILE), 0, java.lang.System.currentTimeMillis(), packageUid);
    } catch (android.os.RemoteException e) {
        return -1;
    }
    android.app.usage.NetworkStats.Bucket bucket = new android.app.usage.NetworkStats.Bucket();
    networkStats.getNextBucket(bucket);
    return bucket.getTxBytes();
}