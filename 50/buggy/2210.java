@java.lang.Override
public void invalidate(java.lang.Object key) {
    checkDisposed();
    cache.invalidate(key);
}