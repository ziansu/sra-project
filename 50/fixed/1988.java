public static double scale(double toScale, int imageSize) {
    return ((toScale / (imageSize - 1)) * 2) - 1;
}