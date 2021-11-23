private static int calculateWidthToScale(int imageHeight, int imageWidth, int newHeight) {
    return ((int) (java.lang.Math.ceil(((newHeight / ((double) (imageHeight))) * newHeight))));
}