public static float getStoragePercentage(long bytesAmount, long bytesTotal) {
    return ((float) (((double) (bytesAmount)) / ((double) (bytesTotal)))) * 100;
}