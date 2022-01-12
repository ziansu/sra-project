public void queueWallpaper(T target, java.lang.String url) {
    android.util.Log.i(com.wallpaperapp.jamie.wallpaperdownloader.WallpaperDownloader.TAG, ("URL: " + url));
    if (url != null) {
        mRequestMap.put(target, url);
        mRequestHandler.obtainMessage(com.wallpaperapp.jamie.wallpaperdownloader.WallpaperDownloader.MESSAGE_DOWNLOAD, target).sendToTarget();
    }
}