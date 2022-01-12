protected void cornerPeaks(float[][] img, int minDistance, gnu.trove.list.TIntList outputKeypoints0, gnu.trove.list.TIntList outputKeypoints1) {
    float thresholdRel = 0.1F;
    boolean excludeBorder = true;
    boolean indices = true;
    int numPeaks = java.lang.Integer.MAX_VALUE;
    int nRows = img.length;
    int nCols = img[0].length;
    algorithms.imageProcessing.ImageProcessor imageProcessor = new algorithms.imageProcessing.ImageProcessor();
    imageProcessor.peakLocalMax(img, minDistance, thresholdRel, true, outputKeypoints0, outputKeypoints1);
    maskCoordinates(outputKeypoints0, outputKeypoints1, nRows, nCols, minDistance);
}