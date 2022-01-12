public void run() {
    android.util.Log.d(com.wallpaperapp.jamie.wallpaperdownloader.WallpaperDownloader.TAG, ("URL: " + url));
    android.util.Log.d(com.wallpaperapp.jamie.wallpaperdownloader.WallpaperDownloader.TAG, ("Target = " + (target.toString())));
    if (!(mRequestMap.get(target).equals(url))) {
        return ;
    }
    mRequestMap.remove(target);
    mWallpaperDownloadListener.onWallpaperDownloadListener(target, bitmap);
}