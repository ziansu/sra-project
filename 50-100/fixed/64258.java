private void getThresholds() {
    thresholds = new java.util.HashMap<java.lang.Integer, java.lang.Double>();
    ij.ImageStack is = img.getStack();
    for (int i = 1; i <= (stackSize); i++) {
        ij.process.ImageProcessor ip = is.getProcessor(i);
        thresholds.put(i, ((ip.getStatistics().mean) + (ip.getStatistics().stdDev)));
    }
}