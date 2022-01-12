private double getS(double mean) {
    double result = 0.0;
    for (double trialResult : trialResults) {
        result += java.lang.Math.pow((trialResult - mean), 2);
    }
    return java.lang.Math.sqrt((result / ((trialResults.length) - 1)));
}