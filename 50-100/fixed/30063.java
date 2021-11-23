protected static double timeCalculation(double[] pixelGray, ij.ImagePlus img) {
    double timePeak = 0.0;
    double min = pixelGray[0];
    double timePerImage = Perfusion_v1_1.PerfusionMetrics.getTimeAcquisition(img);
    for (int i = 1; i < (pixelGray.length); i++) {
        if ((pixelGray[i]) < min) {
            min = pixelGray[i];
            timePeak = ((double) (i + 1));
        }
    }
    timePeak *= timePerImage;
    return timePeak;
}