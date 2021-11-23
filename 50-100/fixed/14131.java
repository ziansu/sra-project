@java.lang.Override
protected android.graphics.Bitmap doInBackground() {
    android.graphics.Bitmap bitmap = com.xxboy.utils.XCacheUtil.getImaveView(super.getImagePath());
    if ((bitmap != null) && (!(bitmap.isRecycled()))) {
        return bitmap;
    }else {
        bitmap = com.xxboy.utils.XBitmapUtil.getImageView(super.getImagePath());
        com.xxboy.utils.XCacheUtil.pushImageView(super.getImagePath(), bitmap);
        return bitmap;
    }
}