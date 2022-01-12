@java.lang.Override
public void invalidateAll() {
    try {
        updateCache();
    } catch (java.io.IOException e) {
        cache.clear();
        indexCacheTime = 0;
    }
}