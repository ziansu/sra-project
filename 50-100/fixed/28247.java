public static java.awt.image.BufferedImage resize(java.awt.image.BufferedImage image) {
    double divider = java.lang.Math.max((((double) (image.getWidth())) / (com.kappa_labs.ohunter.server.analyzer.Analyzer.OPTIMAL_WIDTH)), (((double) (image.getHeight())) / (com.kappa_labs.ohunter.server.analyzer.Analyzer.OPTIMAL_HEIGHT)));
    return com.kappa_labs.ohunter.server.analyzer.Analyzer.resize(image, ((int) ((image.getWidth()) / divider)), ((int) ((image.getHeight()) / divider)));
}