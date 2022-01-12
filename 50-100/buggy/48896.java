public static int getRandomIntegerFromExponentialDistribution(java.util.Random rand, int min, int max, double lambda) {
    double randomDoubleFromUniformeDistrubtion = rand.nextDouble();
    double doubleResult = (-(java.lang.Math.log((1 - ((1 - (java.lang.Math.exp((-lambda)))) * randomDoubleFromUniformeDistrubtion))))) / lambda;
    return nl.tudelft.contextproject.util.RandomUtil.ensureInterval(((int) (java.lang.Math.round(doubleResult))), min, max);
}