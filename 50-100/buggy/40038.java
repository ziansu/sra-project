public long add(@android.support.annotation.NonNull
com.qachee.Qacheeable qacheeable) {
    android.support.v4.util.LruCache<java.lang.Long, com.qachee.Qacheeable> cache = this.qachee.get(qacheeable.getClass());
    if (cache == null) {
        cache = new android.support.v4.util.LruCache(mCacheSize);
    }
    cache.put(qacheeable.getKey(), qacheeable);
    return qacheeable.getKey();
}