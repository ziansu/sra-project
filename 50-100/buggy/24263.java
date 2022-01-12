public static float computeFinalSum(float[] summands) {
    float tmp = (summands[0]) + (summands[1]);
    float simpleSum = summands[((summands.length) - 1)];
    if ((java.lang.Double.isNaN(tmp)) && (java.lang.Double.isInfinite(simpleSum))) {
        return simpleSum;
    }else {
        return tmp;
    }
}