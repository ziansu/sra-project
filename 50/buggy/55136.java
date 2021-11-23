@java.lang.Override
public synchronized boolean isCached(java.lang.String key, long position, long length) {
    com.google.android.exoplayer.upstream.cache.CachedContent cachedContent = index.get(key);
    if (cachedContent == null) {
        return false;
    }
    return cachedContent.isCached(position, length);
}