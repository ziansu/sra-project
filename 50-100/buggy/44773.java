public int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int reqWidth, int reqHeight) {
    final int height = options.outHeight;
    final int width = options.outWidth;
    int inSampleSize = 1;
    while (((height / inSampleSize) > reqHeight) && ((width / inSampleSize) > reqWidth)) {
        inSampleSize *= 2;
    } 
    inSampleSize /= 2;
    return inSampleSize;
}