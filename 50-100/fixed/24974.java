@java.lang.Override
protected void finalize() throws java.lang.Throwable {
    super.finalize();
    for (int i = 0; i < (mWallpaperMap.size()); i++) {
        com.android.server.wallpaper.WallpaperManagerService.WallpaperData wallpaper = mWallpaperMap.valueAt(i);
        wallpaper.wallpaperObserver.stopWatching();
    }
}