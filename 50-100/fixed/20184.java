public void saveEffect() {
    if (((com.framgia.photoalbum.ui.activity.EditActivity.sResultBitmap) != null) && (!(com.framgia.photoalbum.ui.activity.EditActivity.sResultBitmap.isRecycled()))) {
        recycleBitmap(com.framgia.photoalbum.ui.activity.EditActivity.sSourceBitmap);
        com.framgia.photoalbum.ui.activity.EditActivity.sSourceBitmap = com.framgia.photoalbum.ui.activity.EditActivity.sResultBitmap.copy(com.framgia.photoalbum.ui.activity.EditActivity.sResultBitmap.getConfig(), true);
        saveTempImage();
    }
}