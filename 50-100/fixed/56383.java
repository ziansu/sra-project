public synchronized java.util.HashMap<android.content.ComponentName, android.graphics.Bitmap> getAllIcons() {
    java.util.HashMap<android.content.ComponentName, android.graphics.Bitmap> set = new java.util.HashMap<android.content.ComponentName, android.graphics.Bitmap>();
    for (com.sokp.soniclauncher.IconCache.CacheKey ck : mCache.keySet()) {
        final com.sokp.soniclauncher.IconCache.CacheEntry e = mCache.get(ck);
        set.put(ck.componentName, e.icon);
    }
    return set;
}