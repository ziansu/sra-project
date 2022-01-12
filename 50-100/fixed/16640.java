@java.lang.Override
protected void onProgressUpdate(cc.flydev.launcher.LiveWallpaperListAdapter.LiveWallpaperTile... infos) {
    for (cc.flydev.launcher.LiveWallpaperListAdapter.LiveWallpaperTile info : infos) {
        if (info == null) {
            this.notifyDataSetChanged();
            break;
        }
        if ((mWallpaperPosition) < (mWallpapers.size())) {
            mWallpapers.set(mWallpaperPosition, info);
        }else {
            mWallpapers.add(info);
        }
        (mWallpaperPosition)++;
    }
}