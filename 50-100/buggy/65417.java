@java.lang.Override
public void handleMessage(@android.support.annotation.NonNull
android.os.Message msg) {
    synchronized(com.alexvasilkov.events.cache.MemoryCache.CACHE) {
        long now = android.os.SystemClock.uptimeMillis();
        for (java.util.Iterator<java.util.Map.Entry<java.lang.String, com.alexvasilkov.events.cache.MemoryCache.CacheEntry>> iterator = com.alexvasilkov.events.cache.MemoryCache.CACHE.entrySet().iterator(); iterator.hasNext();) {
            com.alexvasilkov.events.cache.MemoryCache.CacheEntry entry = iterator.next().getValue();
            if ((entry.isClearExpired) && ((entry.expires) < now))
                iterator.remove();
            
        }
    }
}