public android.graphics.Bitmap tryLoadPreview(final com.secretincloud.album.data.FileItem fileItem) {
    android.graphics.Bitmap bitmap = tryLoadBitmap(previewProvider, fileItem);
    if (bitmap == null) {
        int rotate = 0;
        com.secretincloud.album.util.ExifUtils.ExifData exifData = tryLoadExif(previewProvider, fileItem);
        if (exifData != null) {
            rotate = exifData.getExifOrientationRotate();
        }
        bitmap = tryLoadBitmap(rawFileProvider, fileItem, previewSize, rotate);
        if (bitmap != null) {
            trySaveBitmap(previewProvider, fileItem, bitmap);
        }
    }
    return bitmap;
}