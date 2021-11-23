public android.graphics.Bitmap decodeSampledBitmapFromFD(java.io.FileDescriptor fd, int reqWidth, int reqHeight) {
    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
    options.inJustDecodeBounds = true;
    android.graphics.BitmapFactory.decodeFileDescriptor(fd, null, options);
    int outWidth = options.outWidth;
    int outHeight = options.outHeight;
    options.inSampleSize = calSampleSize(reqWidth, reqHeight, outWidth, outHeight);
    options.inJustDecodeBounds = false;
    return android.graphics.BitmapFactory.decodeFileDescriptor(fd, null, options);
}