@java.lang.Override
public void loadMedias(int page, java.lang.String albumId) {
    mCurrentAlbumId = albumId;
    if (page == 0) {
        mTasksView.clearMedia();
    }
    android.content.ContentResolver cr = mTasksView.getAppCr();
    com.bilibili.boxing.model.BoxingManager.getInstance().loadMedia(cr, page, albumId, mLoadMediaCallback);
}