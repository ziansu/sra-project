private double[] calculateDiff(byte[] pixels, float mean) {
    double[] diffs = new com.cv4j.core.tpl.diffs[pixels.length];
    for (int i = 0; i < (diffs.length); i++) {
        diffs[i] = (pixels[i]) & (255 - mean);
    }
}