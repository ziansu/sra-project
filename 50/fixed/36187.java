public void clearKeyguardWallpaper() {
    if (com.android.server.wallpaper.WallpaperManagerService.DEBUG)
        android.util.Slog.v(com.android.server.wallpaper.WallpaperManagerService.TAG, "clearWallpaper");
    
    synchronized(mLock) {
        clearKeyguardWallpaperLocked(android.os.UserHandle.getCallingUserId());
    }
}