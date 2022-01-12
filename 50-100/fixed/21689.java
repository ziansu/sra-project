public static int calculateInSampleSize(int width, int height, int reqWidth, int reqHeight) {
    int inSampleSize = 1;
    while (((height / inSampleSize) > reqHeight) && ((width / inSampleSize) > reqWidth)) {
        inSampleSize += 1;
    } 
    return inSampleSize;
}