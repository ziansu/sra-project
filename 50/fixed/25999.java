@java.lang.Override
public void removeCache(java.lang.String path) {
    if (path != null) {
        mLruCache.remove(path);
    }
}