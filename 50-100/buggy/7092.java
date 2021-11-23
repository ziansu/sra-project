private double vectorNorm(java.util.HashMap<java.lang.String, java.lang.Double> inputVector) {
    double result = 0.0;
    for (java.lang.String key : inputVector.keySet()) {
        double temp = inputVector.get(key);
        result += temp * temp;
    }
    return java.lang.Math.sqrt((result / (inputVector.keySet().size())));
}