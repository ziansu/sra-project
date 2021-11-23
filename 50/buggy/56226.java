public synchronized void insertToCache(java.lang.String key, java.lang.Object is, mrrexz.github.com.downcachedroid.model.downfiles.BaseDownFileModule downFileType) {
    dataUpdateListener.cacheElemAdded(key);
    put(key, new android.support.v4.util.Pair(is, downFileType));
}