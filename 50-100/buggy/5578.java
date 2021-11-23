private double computeSharpEdges(ij.process.ImageProcessor proc) {
    double meanIntensity = proc.getStatistics().mean;
    ij.process.ImageProcessor proc1 = proc.duplicate();
    proc1.sharpen();
    proc1.findEdges();
    double meanEdge = proc.getStatistics().mean;
    return meanEdge / meanIntensity;
}