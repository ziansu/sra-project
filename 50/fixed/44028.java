public static double gaussianGenerator(java.util.Random rand, int mean, int stdDev) {
    return ((rand.nextGaussian()) * stdDev) + mean;
}