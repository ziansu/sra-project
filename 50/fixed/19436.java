public void remove(android.content.ComponentName componentName, com.android.launcher3.compat.UserHandleCompat user) {
    mCache.remove(new com.android.launcher3.IconCache.CacheKey(componentName, user));
}