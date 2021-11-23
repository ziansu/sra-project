private double[] calculateDiff(byte[] pixels, float mean) {
    double[] diffs = new double[pixels.length];
    for (int i = 0; i < (diffs.length); i++) {
        diffs[i] = ((int) ((pixels[i]) & 255)) - mean;
    }
    return diffs;
}