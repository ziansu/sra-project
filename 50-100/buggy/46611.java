@com.mapswithme.util.concurrency.UiThread
static void changeMapStyle(java.lang.String theme) {
    int style = com.mapswithme.maps.Framework.MAP_STYLE_CLEAR;
    if (com.mapswithme.util.ThemeUtils.isNightTheme(theme))
        style = com.mapswithme.maps.Framework.MAP_STYLE_DARK;
    
    com.mapswithme.maps.Framework.nativeMarkMapStyle(style);
    com.mapswithme.maps.downloader.DownloaderStatusIcon.clearCache();
    com.mapswithme.maps.widget.menu.MyPositionButton.clearCache();
    android.app.Activity a = com.mapswithme.maps.MwmApplication.backgroundTracker().getTopActivity();
    if ((a != null) && (!(a.isFinishing())))
        a.recreate();
    
}