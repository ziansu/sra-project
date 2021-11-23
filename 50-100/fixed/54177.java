@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... path) {
    android.graphics.Bitmap albumArt = android.graphics.BitmapFactory.decodeFile(path[0]);
    if (albumArt != null) {
        albumArt = scaleCenterCrop(albumArt, mDisplaySize.x, mDisplaySize.y, false);
        android.graphics.Canvas albumCanvas = new android.graphics.Canvas(albumArt);
        albumCanvas.drawBitmap(alphaMask, 0, 0, maskPaint);
    }
    return albumArt;
}