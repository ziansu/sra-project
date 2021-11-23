public void setImageURL(com.king.mangaviewer.model.MangaMenuItem menu, boolean cacheFlag, android.graphics.drawable.Drawable imageDrawable) {
    if ((mMangaMenuItem) != null) {
        if (!(mMangaMenuItem.getHash().equals(menu.getHash()))) {
            com.king.mangaviewer.util.imagemanager.ImageManager.removeDownload(mDownloadThread, menu);
        }else {
            return ;
        }
    }
    setImageDrawable(imageDrawable);
    mMangaMenuItem = menu;
    if (menu != null) {
        mCacheFlag = cacheFlag;
        mDownloadThread = com.king.mangaviewer.util.imagemanager.ImageManager.startDownload(this, cacheFlag);
    }
}