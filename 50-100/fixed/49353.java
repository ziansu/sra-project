public double getStandardDeviationHopes(double mean) {
    double averageHopes = 0.0;
    for (SuccessQuery sq : successQueryList) {
        averageHopes += java.lang.Math.pow(((sq.getHops()) - mean), 2);
    }
    return java.lang.Math.sqrt((averageHopes / (successQueryList.size())));
}