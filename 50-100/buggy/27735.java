private double getMapNormalizeValue(java.util.Map<java.lang.Integer, processing.analyzing.ReuseProbValue> map) {
    double sum = 0.0;
    for (java.util.Map.Entry<java.lang.Integer, processing.analyzing.ReuseProbValue> entry : map.entrySet()) {
        sum += entry.getValue().getSum();
    }
    return sum;
}