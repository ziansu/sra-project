@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... paths) {
    android.graphics.Point screenSize = com.framgia.photoalbum.util.CommonUtils.getDisplaySize(this);
    return com.framgia.photoalbum.util.CommonUtils.decodeSampledBitmapResource(paths[0], screenSize.x, screenSize.y);
}