public synchronized void insertToCache(java.lang.String key, java.lang.Object data, mrrexz.github.com.downcachedroid.model.downfiles.BaseDownFileModule downFileType) {
    put(key, new android.support.v4.util.Pair(data, downFileType));
    dataUpdateListener.cacheElemAdded(key);
}