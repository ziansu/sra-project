public void getTitleAndIcon(com.android.launcher3.AppInfo application, com.android.launcher3.compat.LauncherActivityInfoCompat info, java.util.HashMap<java.lang.Object, java.lang.CharSequence> labelCache) {
    synchronized(mCache) {
        com.android.launcher3.IconCache.CacheEntry entry = cacheLocked(application.componentName, info, labelCache, info.getUser(), false, application.unreadNum);
        application.title = entry.title;
        application.iconBitmap = entry.icon;
        application.contentDescription = entry.contentDescription;
    }
}