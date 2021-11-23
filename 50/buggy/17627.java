private double[][][] lms2lab(double[][][] llms) {
    return matrixMultiply(com.example.filter.improc.ImgProcessor.AB, llms);
}