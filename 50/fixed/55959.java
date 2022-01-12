public static ij.process.ImageProcessor divide(ij.process.ImageProcessor mat, double value) {
    ij.process.ImageProcessor matout = new ij.process.FloatProcessor(mat.getFloatArray());
    matout.multiply((((double) (1)) / value));
    return matout;
}