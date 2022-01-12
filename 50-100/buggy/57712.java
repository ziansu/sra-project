public int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int reqWidth, int reqHeight) {
    int height = options.outHeight;
    int width = options.outWidth;
    int inSampleSize = 1;
    if ((height > reqHeight) || (width > reqWidth)) {
        int halfHeight = height / 2;
        int halfWidth = width / 2;
        while (((halfHeight / inSampleSize) >= reqHeight) && ((halfWidth / inSampleSize) >= reqWidth)) {
            inSampleSize *= 2;
        } 
    }
    return inSampleSize;
}