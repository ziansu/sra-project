public synchronized android.graphics.Bitmap getIcon(android.content.ComponentName component, com.android.launcher3.compat.LauncherActivityInfoCompat info, java.util.HashMap<java.lang.Object, java.lang.CharSequence> labelCache) {
    if ((info == null) || (component == null)) {
        return null;
    }
    com.android.launcher3.IconCache.CacheEntry entry = cacheLocked(component, info, labelCache, info.getUser(), false, (-1));
    return entry.icon;
}