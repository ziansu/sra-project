@java.lang.Override
protected void onDestroy() {
    com.framgia.photoalbum.util.CommonUtils.setImageViewBitmap(mEditImage, null);
    if (((mLoadImageTask) != null) && (mLoadImageTask.isCancelled())) {
        mLoadImageTask.cancel(true);
    }
    com.framgia.photoalbum.util.CommonUtils.recycleBitmap(com.framgia.photoalbum.ui.activity.EditActivity.sSourceBitmap);
    com.framgia.photoalbum.util.CommonUtils.recycleBitmap(com.framgia.photoalbum.ui.activity.EditActivity.sResultBitmap);
    super.onDestroy();
}