private static int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int requiredWidth, int requiredHeight, int requiredInSampleSize) {
    final int height = options.outHeight;
    final int width = options.outWidth;
    int inSampleSize = 1;
    if ((height > requiredHeight) || (width > requiredWidth)) {
        final int halfHeight = height / 2;
        final int halfWidth = width / 2;
        while (((halfHeight / inSampleSize) > requiredHeight) || ((halfWidth / inSampleSize) > requiredWidth)) {
            inSampleSize *= 2;
        } 
    }
    return inSampleSize;
}