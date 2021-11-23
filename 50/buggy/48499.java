public static boolean supportsDrop(java.lang.Object info) {
    return ((info instanceof com.android.chavah.ShortcutInfo) || (info instanceof com.android.chavah.LauncherAppWidgetInfo)) || (info instanceof com.android.chavah.FolderInfo);
}