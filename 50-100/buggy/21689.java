public static float calculateInSampleSize(int width, int height, int reqWidth, int reqHeight) {
    float inSampleSize = 1;
    while (((height / inSampleSize) > reqHeight) && ((width / inSampleSize) > reqWidth)) {
        inSampleSize += 0.1;
    } 
    return inSampleSize;
}