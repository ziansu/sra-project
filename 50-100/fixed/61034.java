public static boolean isBlack(int pixel) {
    int grayscalePixel = ((((pixel >> 16) & 255) + ((pixel >> 8) & 255)) + (pixel & 255)) / 3;
    return grayscalePixel <= (binangkit.lingga.jelink.simplenumberrecognition.PatternRecognizerUtils.BLACK_THRESHOLD);
}