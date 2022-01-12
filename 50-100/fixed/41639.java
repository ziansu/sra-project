@java.lang.Override
protected void onDestroy() {
    setImageViewBitmap(mEditImage, null);
    if (((mLoadImageTask) != null) && (mLoadImageTask.isCancelled())) {
        mLoadImageTask.cancel(true);
    }
    recycleBitmap(com.framgia.photoalbum.ui.activity.EditActivity.sSourceBitmap);
    recycleBitmap(com.framgia.photoalbum.ui.activity.EditActivity.sResultBitmap);
    super.onDestroy();
}