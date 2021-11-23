public static android.graphics.Bitmap rotateBitmapByExif(android.graphics.Bitmap bitmap, java.lang.String path, boolean isRecycle) {
    int digree = cn.forward.androids.utils.ImageUtils.getBitmapExifRotate(path);
    if (digree != 0) {
        bitmap = cn.forward.androids.utils.ImageUtils.rotate(bitmap, digree, isRecycle);
    }
    return bitmap;
}